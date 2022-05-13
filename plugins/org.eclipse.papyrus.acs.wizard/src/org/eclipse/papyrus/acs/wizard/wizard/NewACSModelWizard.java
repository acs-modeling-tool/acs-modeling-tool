package org.eclipse.papyrus.acs.wizard.wizard;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.papyrus.infra.core.resource.BadArgumentExcetion;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.acs.wizard.ACSConstants;
import org.eclipse.papyrus.acs.wizard.pages.DummySelectRepresentationKindPage;
import org.eclipse.papyrus.acs.wizard.pages.SelectViewPointPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.NewModelFilePage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectArchitectureContextPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRepresentationKindPage;
import org.eclipse.papyrus.uml.diagram.wizards.wizards.CreateModelWizard;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

public class NewACSModelWizard extends CreateModelWizard {
	private static final String DOT_UML = ".uml"; //$NON-NLS-1$

	private static final String DOT_DI = ".di"; //$NON-NLS-1$

	public static final String MODEL_NAME_UC = "[modelNameUC]"; //$NON-NLS-1$

	/** The Constant WIZARD_ID. */
	public static final String WIZARD_ID = "org.eclipse.papyrus.acs.wizards.createmodel"; //$NON-NLS-1$

	protected SelectViewPointPage selectViewPointPage;

	protected DummySelectRepresentationKindPage selectRepresentationKindPage;

	@Override
	public void addPage(IWizardPage page) {
		if (page instanceof SelectArchitectureContextPage) {
			selectViewPointPage = new SelectViewPointPage();
			super.addPage(selectViewPointPage);
		} else if (page instanceof DummySelectRepresentationKindPage) {
			// do nothing, i.e. representation page will not be shown
		} else {
			super.addPage(page);
		}
	}

	/**
	 * Gets the selected context ids.
	 */
	@Override
	protected String[] getSelectedContexts() {
		return new String[] { ACSConstants.ACS_CONTEXT };
	}

	/**
	 * Gets the viewpoint ids.
	 */
	@Override
	protected String[] getSelectedViewpoints() {
		return selectViewPointPage.getSelectedIDs();
	}

	/**
	 * Enable called to set viewpoint programmatically
	 */
	public void setViewpoint(String selectedId) {
		selectViewPointPage.setSelectedID(selectedId);
	}

	public void updateExtension() {
		String extension = getExtension();
		IWizardPage modelPage = getPages()[1];
		// TODO - will not work if another implementation of the interface
		// INewPapyrusModelPage is used (but we need to change extension)
		if (extension != null && modelPage instanceof NewModelFilePage) {
			((NewModelFilePage) modelPage).diagramExtensionChanged(extension);
		}
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page instanceof SelectViewPointPage) {
			// superclass would redirect to the standard architecture selection page
			// (and cause an NPE, since this page is not present in this wizard)
			IWizardPage modelPage = getPages()[1];
			updateExtension();
			return modelPage;
		}
		return super.getNextPage(page);
	}

	protected String getExtension() {
		String extension = DOT_UML;
		String id = selectViewPointPage.getSelectedID();
		if (id != null && id.startsWith(ACSConstants.VIEWPOINT_PREFIX)) {
			if (id.endsWith(ACSConstants.ACS_BUILDING)) {
				extension = ACSConstants.ACS_FILE_EXTENSION;
			}
		}
		return extension.replace(DOT_UML, DOT_DI).substring(1);
	}

	protected SelectRepresentationKindPage doCreateSelectRepresentationKindPage() {
		selectRepresentationKindPage = new DummySelectRepresentationKindPage(createContextProvider());
		return selectRepresentationKindPage;
	}

	/**
	 * Perform finish.
	 *
	 * @return true, if successful {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		selectRepresentationKindPage.selectTemplate(selectViewPointPage.getSelectedID());
		updateExtension();

		final URI newURI = createNewModelURI(ACSConstants.ACS_CONTEXT);

		String[] viewpointIds = getSelectedViewpoints();
		createAndOpenPapyrusModel(newURI, ACSConstants.ACS_CONTEXT, viewpointIds);

		return true;
	}

	@Override
	protected String getRootElementName() {
		return upperCaseFirst(selectRepresentationKindPage.getRootElementName()) +
				upperCaseFirst(getExtension().replace(DOT_DI, "")); //$NON-NLS-1$
	}

	@Override
	protected void initDomainModel(ModelSet modelSet, String contextId, String[] viewpointIds) {
		super.initDomainModel(modelSet, contextId, viewpointIds);
		Resource umlR = UmlUtils.getUmlResource(modelSet);
		NotationModel notation = NotationUtils.getNotationModel(modelSet);
		Diagram diagram;
		try {
			diagram = notation.getDiagram(MODEL_NAME_UC);
			if (diagram != null) {
				final String newName = upperCaseFirst(selectRepresentationKindPage.getRootElementName()) +
					" diagram"; //$NON-NLS-1$
				getCommandStack(modelSet).execute(
						new RecordingCommand(modelSet.getTransactionalEditingDomain()) {

							@Override
							protected void doExecute() {
								diagram.setName(newName);
							}
						});
			}
		} catch (NotFoundException e) {
			// do nothing, will always happen, if no diagram with magic name is found 
		} catch (BadArgumentExcetion e) {
			//do nothing
		}
		Package root = (Package) umlR.getContents().get(0);

		NamedElement ne = root.getPackagedElement(MODEL_NAME_UC);
		if (ne != null) {
			// ne.add
			String ucFirst = upperCaseFirst(selectRepresentationKindPage.getRootElementName());
			SetRequest setRequest = new SetRequest(ne, UMLPackage.eINSTANCE.getNamedElement_Name(), ucFirst);
			ICommand setNameCmd = ElementEditServiceUtils.getCommandProvider(ne).getEditCommand(setRequest);

			if (setNameCmd.canExecute()) {
				getCommandStack(modelSet).execute(GMFtoEMFCommandWrapper.wrap(setNameCmd));
			}
		}
	}
	
	/**
	 * Make the first character in a string upper case
	 * 
	 * @param str
	 *            a string
	 * @return the string with the first character upper case
	 */
	public static String upperCaseFirst(String str) {
		if (str.length() > 0) {
			return str.substring(0, 1).toUpperCase() + str.substring(1);
		} else {
			return str;
		}
	}
}

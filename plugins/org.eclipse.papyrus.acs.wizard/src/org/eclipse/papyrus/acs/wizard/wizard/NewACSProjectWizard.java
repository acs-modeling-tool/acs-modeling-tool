package org.eclipse.papyrus.acs.wizard.wizard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.acs.documentation.internal.DocumentationGenerator;
import org.eclipse.papyrus.acs.wizard.ACSConstants;
import org.eclipse.papyrus.acs.wizard.Activator;
import org.eclipse.papyrus.uml.diagram.wizards.pages.PapyrusProjectCreationPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectArchitectureContextPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * The Wizard creates a new Project and a ACS Model inside it.
 */
public class NewACSProjectWizard extends NewACSModelWizard {

	private static final String DOT = "."; //$NON-NLS-1$

	private static final String SLASH = "/"; //$NON-NLS-1$


	/** The Constant WIZARD_ID. */
	public static final String WIZARD_ID = "org.eclipse.papyrus.acs.wizard.createproject"; //$NON-NLS-1$

	/** The new project page. */
	private PapyrusProjectCreationPage myProjectPage;

	@Override
	public boolean isCreateProjectWizard() {
		return true;
	}

	/**
	 * Initializes the wizard 
	 *
	 * @param workbench
	 *            the workbench
	 * @param selection
	 *            the selection {@inheritDoc}
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("Create your ACS project");
		setMyProjectPage(new PapyrusProjectCreationPage("Choose template: "));
		setDefaultPageImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, " icons/structure.gif")); //$NON-NLS-1$
	}



	/**
	 * Adds the pages.
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		// Gives the CreateModelWizard the newProjectPage to display it after the SelectViewPointPage
		setNewProjectPage(getMyProjectPage());
		selectArchitectureContextPage = new SelectArchitectureContextPage();
		super.addPages();
	}

	/**
	 * Perform finish.
	 *
	 * @return true, if successful {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		IProject newProjectHandle;
		try {
			newProjectHandle = createNewProject();
		} catch (CoreException e) {
			return false;
		}
		if (newProjectHandle == null) {
			return false;
		}

		return super.performFinish();
	}

	/**
	 * Creates the new project.
	 *
	 * @return the i project
	 * @throws CoreException
	 *             the core exception
	 */
	protected IProject createNewProject() throws CoreException {
		// get a project handle
		final IProject project = getMyProjectPage().getProjectHandle();

		// get a project descriptor
		java.net.URI projectLocationURI = null;
		if (!getMyProjectPage().useDefaults()) {
			projectLocationURI = getMyProjectPage().getLocationURI();
		}

		IProjectDescription projectDescription = null;
		NullProgressMonitor progressMonitor = new NullProgressMonitor();
		if (!project.exists()) {
			projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(project.getName());
			if (projectLocationURI != null) {
				projectDescription.setLocationURI(projectLocationURI);
			}
			project.create(projectDescription, SubMonitor.convert(progressMonitor, 1));
			project.open(SubMonitor.convert(progressMonitor, 1));
			IFolder models = project.getFolder(ACSConstants.FOLDER_MODELS);
			models.create(true, true, null);
			String id = selectViewPointPage.getSelectedID();
			if (id != null && id.startsWith(ACSConstants.VIEWPOINT_PREFIX)) {
				if (id.endsWith(ACSConstants.ACS_BUILDING)) {
					
					//Create documentation folder
					IFolder documentation = models.getFolder(ACSConstants.FOLDER_DOCUMENTATION);
					documentation.create(true, true, null);

					try {
						String os_sep = FileSystems.getDefault().getSeparator();

						//Make an appropriate location
						String QuickStartPath = documentation.getRawLocationURI().getPath() + os_sep + "QuickStart.md";
						String fullguidePath = documentation.getRawLocationURI().getPath() + os_sep + "FullGuide.md";
						
						//Create the files
						if (new File(QuickStartPath).createNewFile()) {
							FileWriter starterguidePathFileWriter = new FileWriter(QuickStartPath);
							starterguidePathFileWriter.write(DocumentationGenerator.generateQuickStartDocumentation());
							starterguidePathFileWriter.close();
						} else {
							System.out.println("Couldn't create documentation file: " + QuickStartPath);
						}
						if (new File(fullguidePath).createNewFile()) {
							FileWriter fullguidePathFileWriter = new FileWriter(fullguidePath);
							fullguidePathFileWriter.write(DocumentationGenerator.generateFullDocumentation());
							fullguidePathFileWriter.close();
						} else {
							System.out.println("Couldn't create documentation file: " + fullguidePath);
						}	
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			project.open(SubMonitor.convert(progressMonitor, 1));
		}
		IWorkingSet[] workingSets = getMyProjectPage().getSelectedWorkingSets();
		if (workingSets.length > 0) {
			PlatformUI.getWorkbench().getWorkingSetManager().addToWorkingSets(project, workingSets);
		}
		System.out.println("New ACS Project made.");
		return project;
	}

	@Override
	protected URI createNewModelURI(String categoryId) {
		// handle extension
		String extension = getExtension();
		String id = selectViewPointPage.getSelectedID();
		String folder = ""; //$NON-NLS-1$
		if (id.endsWith(ACSConstants.ACS_BUILDING)) {
			folder = ACSConstants.FOLDER_COMPONENTS;
		}
		IPath newFilePath = getMyProjectPage().getProjectHandle().getFullPath().append(ACSConstants.FOLDER_MODELS + SLASH + folder + SLASH + getMyProjectPage().getFileName() + DOT + extension);
		return URI.createPlatformResourceURI(newFilePath.toString(), true);
	}

	public PapyrusProjectCreationPage getMyProjectPage() {
		return myProjectPage;
	}

	public void setMyProjectPage(PapyrusProjectCreationPage myProjectPage) {
		this.myProjectPage = myProjectPage;
	}

	protected WizardNewProjectCreationPage createNewProjectCreationPage() {
		return this.myProjectPage;
	}
}

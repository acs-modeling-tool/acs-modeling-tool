package org.eclipse.papyrus.acs.properties.internal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.papyrus.infra.architecture.listeners.IArchitectureDescriptionListener;

public class PropertiesHider implements IArchitectureDescriptionListener {

	@Override
	public void architectureContextChanged(Notification notification) {
		// Nothing to do for now
	}

	@Override
	public void architectureViewpointsChanged(Notification notification) {
		// Nothing
	}

}
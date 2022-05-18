package org.eclipse.papyrus.acs.properties;

import org.eclipse.papyrus.acs.properties.internal.ContextConfigurator;
import org.eclipse.papyrus.views.properties.runtime.ConfigurationManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.papyrus.acs.properties"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	public static final ConfigurationManager configurationManager = ConfigurationManager.getInstance();
	
	/**
	 * The constructor
	 */
	public Activator() {
		System.out.println("Constructor: " + this.getClass().getPackage().getName());
	}

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start: " + this.getClass().getPackage().getName());
		ContextConfigurator.hideDefault();
		ContextConfigurator.showACS();
		plugin = this;
		super.start(context);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		System.out.println("Stop: " + this.getClass().getPackage().getName());
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
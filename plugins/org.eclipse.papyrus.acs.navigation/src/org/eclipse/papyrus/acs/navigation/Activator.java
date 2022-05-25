package org.eclipse.papyrus.acs.navigation;


import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import org.eclipse.papyrus.infra.widgets.util.Constants;
import org.eclipse.uml2.common.CommonPlugin;

/**
 * The activator class controls the plug-in life cycle
 */
@SuppressWarnings("unused")
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.papyrus.acs.navigation"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
		System.out.println("Constructor: " + this.getClass().getPackage().getName());
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		new org.eclipse.papyrus.acs.newchild.Activator().start(context);;
		System.out.println("Start: " + this.getClass().getPackage().getName());
		plugin = this;
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
# Navigation Plugin
The "Navigation Plugin" is intended to add additional "navigation options" when right-clicking a model and going to the "navigate >" sub-context-menu.

The "Navigation Provider" classes contain the logic to compute additional "Navigation elements" that become clickable in the GUI.

This plugin currently does not add any working functionality.


## Files and folders
`src/org.eclipse.papyrus.acs.navigation.NavigateToConnectedSystem.java`: A non-working navigation provider class.

`src/org.eclipse.papyrus.acs.navigation.SpecialTargetNavigableElement.java`: A generic navigation element that could be used for any ACS element.


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the plugin.xml-file.

The plugin-file contains a single "extension" that registers the `org.eclipse.papyrus.acs.navigation.NavigateToConnectedSystem.java`-file as a navigation provider, but as mentioned, this does not add any new, working functionality.


## Dependencies
This plugin depends on the "Profile" plugin to recognize the types of elements to navigate to.

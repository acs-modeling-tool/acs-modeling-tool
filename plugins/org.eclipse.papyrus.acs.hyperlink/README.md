# Hyperlink Plugin
The "Hyperlink Plugin" is intended to allow easier navigation between ACS model components by generating specialized "jump/navigation choices" when double-clicking elements, e.g., double-clicking an atomic system and getting the option to ump to any event, controller, or type in said AS.

However, the plugin currently does not add any working functionality. 


## Files and folders
`src/org.eclipse.papyrus.acs.hyperlink/AtomicToController.java`: Was intended to allow navigation to the Controller of an Atomic System, but since the build-in navigation already allowed this, this was kept for future reference. NOTE: The code does not fully work.


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the plugin.xml-file.

The plugin-file contains a single "extension" that registers `AtomicToController.java` as a hyperlink provider, but as mentioned, the code does not actually do a difference.


## Dependencies
This plugin does not depend on any othe plugins.

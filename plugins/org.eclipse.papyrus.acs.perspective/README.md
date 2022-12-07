# Perspective Plugin
The "Perspective Plugin" adds a custom perspective (configuration of window elements in the IDE) specialized for ACS, which adds build-in shortcuts at the "welcome screen" and in the "File-menu" to create new ACS projects/models, as well as some standard views.

To change the current perspective in Eclipse Modeling Tools, the ACS tool, or just Papyrus for that matter, see the "Open perspective" button at the top right of the GUI.


## Files and folders
The only file of interest is the `src/org.eclipse.papyrus.acs.perspective.impl/PapyrusACSPerspective.java`-file, which contains the code needed to build a custom perspective for ACS projects and models.


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the `plugin.xml`-file. 

The plugin-file first contains an extension that registers the `PapyrusACSPerspective.java` class as a new perspective in the "Open Perspective" menu.

Secondly, the plugin-file contains two extensions that are set to automatically enable (if not already) the ACS perspective if an ACS project or model is created using any of the ACS-provided project/model wizards.


## Dependencies
This plugin depends on the ACS project and model creation wizards (the IDs thereof) created by the "Wizard"-plugin in order to associate the new perspective with the projects created by these wizards.
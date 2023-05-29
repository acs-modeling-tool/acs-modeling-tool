# NewChild Plugin
The "NewChild Plugin" adds the option to add new ACS model elements to an intended parent element through the context-menu when right-clicking an ACS element in the "Model Explorer" shown in the left side of the ACS tool GUI. Look for the sub-menus "ACS Structure", "ACS Event", "ACS Controller", and "ACS Type".

However, as it turns out, even though these buttons/menus correctly add ACS element in the model-tree (in the model explorer), these element are not graphically added to the ACS diagrams. Until this is automatically done, we recommend only using the palette (see the "Palette"-plugin) to add elements.


## Files and folders
`src/org.eclipse.papyrus.acs.newchild.internal/HideContextMenus.java`: The `clean()` function of this class is run by the `Activator.java` class upon the plugin being loaded into Papyrus. It removes the context-menus that allow adding native UML elements to the model-tree, since these aren't supported in ACS.

`resources/*.creationmenumodel`: These files describe the contents of each of the ACS element creation context-menus.

`resources/*.gif`: These files are the images associated with the context-menus added by the `*.creationmenumodel`-files.


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the `plugin.xml`-file. 

The plugin-file contains a single "extension" that registers the four `*.creationmenumodel`-files as descriptors for new context-menus in the Model Explorer.


## Dependencies
This plugin depends on the "Palette"-plugin to get access to the `[palette]/resources/model_shapes.elementtypeconfigurations`-file (see "Palette"-plugin for more) and the "Profile" plugin to get information about ACS elements/stereotypes.

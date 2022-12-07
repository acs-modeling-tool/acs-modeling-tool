# Properties Plugin
The "Properties Plugin" adds property menus (aka. context menus) tailored for the ACS model elements. In Papyrus, when selecting any UML/model element, the "Properties view" will show a list of tabs (e.g., "UML", "Appearance", "Profile", etc.). This plugin adds an "ACS"-tab to the properties view to allow configuring ACS-native properties on ACS elements.


## Files and folders
`src/org.eclipse.papyrus.acs.properties.internal/ContextConfigurator.java`: A helper class which the `src/org.eclipse.papyrus.acs.properties.internal/Activator.java`-class uses to enable the ACS-related context menus (tabs) and disable the context menus (tabs) that ACS do not need.

`properties/*`: the `.ctx` and the entire `ui/` folder are both auto-generated based on the ACS profile. These are the files Papyrus use to generate context menus for the ACS profile elements.

To create the context menu files, do the following:
- Right-click any folder in the Project Explorer and select "New > Other > Property view configuration". (The right-clicked folder does not matter since you need to manually set the output folder later.)
- Select "Create from ECore metamodel" and press "Next".
- In "Target", navigate to and select the `[your_profile].ecore` file from the plugin containing your profile.
- In "Source", set the output to `org.eclipse.papyrus.acs.properties/properties/[your_profile].ctx` (or wherever you want the `[your_profile].ctx`-file and `ui/`-folder to be generated).
- Press "Next", keep "Don't generate dependencies", and press "Next" again.
- You may now keep the default settings and press "Finish" to generate the context menu files and folders.
- Open the `[your_profile].ctx`-file and select the first child-node under the `[your_profile]`-node.
    - Give it a proper label.
    - Select a value in "After Tab" (else the context menu won't show up).


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the `plugin.xml`-file. 

The plugin-file contains a single "extension" that registers the `properties/model.ctx`-file as a descriptor of a new context menu (i.e. the ACS context menu).


## Dependencies
This plugin depends on the "Profile"-plugin in order to generate the files found in the `properties/`-folder.

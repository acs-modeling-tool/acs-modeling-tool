# Architecture Plugin

The "Architecture Plugin" adds 4 new types of diagrams "Structure", "Controller", "Event", and "Type", which correspond to the "Structure", "Behavior (Controller + Events)", and "Type" layers in ACS. Additionally, it provides some resources for visual styling of the tool's GUI.

Although the Type-layer in ACS is textual, the only way to properly support ACS Types in Papyrus (to our knowledge) is through a diagram with objects that represent these types.


## Files and folders

`resources/acs.architecture`: The "main file", so to speak, of this plugin. It defines an ACS model as a whole, the diagram types of an ACS model, how diagrams and ACS-additions are styled, and how Eclipse should create ACS models.

A diagram definition describes which UML diagram it is based on, the custom css-stylings applied to the components placed within the diagram, the "palette" (see the palette plugin) of available components to place in the diagram and more. 

- NOTE1: The only way for us to register the palette for each diagram type was to manually edit the underlying XML file to reference the ID of the palette. After doing this, we became able see the palettes in the Eclipse Modeling Tools editor, when trying to select the palette for the diagram.
- NOTE2: The file defines two versions of the "Type Diagram". This is because both "System of Interest (SoI)" and "Atomic System (AS)" components can contain one.

`src/org.eclipse.papyrus.acs.architecture/acsModelCreationCommand.java`: Describes how Papyrus should create an ACS model/project, based on the template ACS model found in the "wizard" plugin.

`resources/*.css`: These files describe the "look" of elements within the new diagram types.

`graphics/*`: Image-resources used by the plugin.


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the `plugin.xml`-file. 

The plugin-file contains a single "extension" that registers the `resources/acs.architecture`-file as an architecture-extension. This is what loads the new diagrams into Papyrus.


## Dependencies
This plugin depends on contents from the "Wizard" and the "Palette" plugins.

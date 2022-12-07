# Palette Plugin
The "Palette Plugin" provides palette-configuration files that describe a set of available ACS elements wrt. the model/diagram editor. There are separate palette configurations for each ACS diagram added by the "Achitecture"-plugin. The "Palette Plugin" further adds type-descriptions of each ACS element, which is the foundation for the ACS elements' existence as model elements.

NOTE: To see how `.elementtypesconfigurations`-files are generated, see the "Profile"-plugin.


## Files and folders
`resources/model_shapes.elementtypesconfigurations`: The basic information about the existence of ACS Profile elements as model elements, as well as which UML elements they are based on to determine drawing style. (To us, the authors, this would seem like redundant information since it is already present in the profile, but we don't know of any other way to configure the available elements in a palette.)

`resources/*.paletteconfiguration`: There is one of these files for each ACS diagram type (4 in total) which outline which model elements should be made available in the model/diagram editor when building an ACS model.


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the `plugin.xml`-file. 

The plugin-file contains a single "extension" that registers the `model_shapes.elementtypesconfigurations`-file as a descriptor for the existence of the various ACS model elements. This allows actually using the model elements in the palettes.


## Dependencies
This plugin indirectly depends on the Profile plugin, since the `model_shapes.elementtypesconfigurations`-file from "Palette" is a copy of the `model/model.elementtypesconfigurations`-file which has been extended with additional, extended element types (simply with more details on them), that are needed in Papyrus to determine how Papyrus should draw the elements in the model/diagram editor (e.g. similar to a component, similar to a class, similar to a state machine, etc.)

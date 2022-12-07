# Documentation Plugin
The "Documentation Plugin" does not explicitly add features to the ACS tool, but provides some simple documentation generation code that other plugins can use. It also contains assorted notes and old resources.


## Files and folders
`documentation/*`: This folder contains two files. The first file `quick.md` is a quick-guide to get started with the ACS tool. The other file ´full.md´ is a template used to generate full documentation related to all errors that the ACS IDE can generate.

`src/org.eclipse.papyrus.acs.documentation.internal/DocumentationGenerator.java`: Used to generate the full documentation about errors.

`resources/*`: Simply assorted resources, both old and newer.

`unsorted_notes_for_devs/*`: Contains some notes and pseudocode related to verification used among the developers.


## Plugin Configuration
The plugin does not provide any additional configuration.


## Dependencies
Depends on the "Validation" plugin in order to iterate the various constaints that a model can break (i.e. possible errors).

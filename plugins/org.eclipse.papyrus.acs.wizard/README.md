# Wizard Plugin
The "Wizard Plugin" provides creation-wizards for entire ACS projects and single ACS models, as well as a wizard for creating a very small example ACS model.


## Files and folders
`src/org/eclipse/papyrus/acs/wizard/`: This folder contains classes with utility information.

`src/org/eclipse/papyrus/acs/wizard/pages/`: This folder contains classes that describe some additional wizard-pages that are used by the new ACS-related wizards.

`src/org/eclipse/papyrus/acs/wizard/wizard/`: This folder contains "wizard classes" which describe how the two ACS-related wizards should behave.

`icons/structure.gif`: The icon used for some wizards.

`resources/`: This folder contains the standard ACS model files used to instantiate new ACS models in the compiled ACS tool.

`sample/Models/`: This folder contains a small example ACS model which can be created through the "example wizard" (see "Plugin Configuration").


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the `plugin.xml`-file.

- First, the plugin adds three new creation-wizards:
    - The first wizard creates an ACS project with an initial model, following the procedures in the `NewACSProjectWizard.java`-class.
    - The second wizard creates an ACS model within an existing ACS project, following the procedures in the `NewACSModelWizard.java`-class.
    - The third wizard is an "example model wizard" which creates one example model chosen from a list of presents.
        - There is only one example ACS model which is defined in the `org.eclipse.emf.common.ui.examples` extension of this plugin. 
- The second extension registers the model `resources/template.acs.*` as a template for project/model creation. I'm unsure about how this integrates into Papyrus, but if this is deleted, ACS model creation stops working. This would seem to relate to the `/src/org/eclipse/papyrus/acs/architecture/acsModelCreationCommand.java` file from the "Architecture"-plugin.
- The third and last extension registers the model in `sample/Models/test_examples.acs.*` as an example model that is available from the example wizard from the first extension.


## Dependencies
This plugin depends on the "Documentation"-plugin to generate the documentation files located in all ACS projects.

Apparently, there is a dependency on the "Architecture"-plugin (see Plugin Configuration above), but I'm unsure how.

# Profile Plugin
The "Profile Plugin" adds the UML metamodel of ACS to Papyrus. This is where all ACS elements are modeled, and from which all other files that describe the ACS elements are generated.


## Files and folders
`src/*`: Mostly boilerplate code and assorted constants.

`src-gen/*`: These interfaces and classes for all ACS elements, which are imported into and used in Papyrus. This folder also contains various other types of classes such as package-descriptors, factories, and other auto-generated files that Papyrus needs. NOTE: See further below for a guide to generate code-files for your Profile elements.

`icons/acs.png`: A seemingly unused icon.

`model/model.profile.di`: A bit like the "root-element" of the profile. Not much interesting info here.

`model/model.profile.uml`: Contains an XML tree that fully describes the "logical structure" if the Profile, with no regards for the visual representation/layout of the "Profile Diagram" itself.

`model/model.profile.notation`: Contains information about the visual layout of the Profile Diagram. Eclipse Modeling Tools uses this data to display the Profile Diagram in the editor.

`model/model.ecore`: ["ECore" is a metamodel for describing models and runtime support for various features](https://wiki.eclipse.org/Ecore). This file is generated together with the `.genmodel`-file described below.

`model/model.profile.genmodel`: This file is used to generate source-code/classes for all model elements in a Profile (i.e., ACS elements in our case).

Firstly, to create the `model/model.profile.*` files:
- Create a folder to contain the model files in the "Project Explorer"-view.
    - We'll refer to it as `[your_profile]`.
- Right-click this folder and select "New > Papyrus Model".
- Under "Architecture Contexts" select the "Profile"-context.
- Press finish.
    - This will create the `[your_profile].profile.[di|uml|notation]`-files in the `[your_profile]`-folder.

To generate a `.genmodel`-file and `.ecore`-file:
- Right-click (preferably) the folder in which you have your Profile files (i.e., `*.profile.[di|uml|notation]`) and press "New > Other".
- Search for "gen" and select the "EMF Generator Model".
- Save the file in the previously selected folder as `[your_profile].profile.genmodel`.
- Select the "UML model" model importer from the ensuing list.
- Press on "Browse Workspace" at the top of the next menu and find & select your profile's UML-file (i.e., `[your_profile].profile.uml`).
    - You will likely get a "Warning" pop-up. If it only says "**problems/warnings** detected" and not "**errors** detected", you may ignore the prompt and continue.
- If no "errors" above, press "Next".
- In the "Root packages" list, select the entry with the filename `[your_profile].ecore`. In the "Referenced generator models" list, select the root-elements of those that do not belong to your profile.
    - The "root packages" are those Eclipse should generate code for, whereas "reference generator models" are dependencies, but which we do not generate code for.
- Press "Finish" and your `.ecore`- and `.genmodel`-files should both show up in the folder you specified.

To generate source-code from the `.genmodel`-file:
- If you want to generate code-files in a folder separate from your `src/`-folder:
    - First, right-click the `.genmodel`-file and press "Open". (To our knowledge, this is the only way to open it.)
    - Left-click the root element that states the name of your profile and go to the "properties view" in Eclipse Modeling Tools.
    - Scroll down to the "Model" category
    - In "Model Directory", add "-gen" at the end of the path to output files to "`src-gen`" instead of "`src`".
- In the `.genmodel`-tree-view, open the root element and right-click the sub-element that represents your Profile.
- Press "generate model code".

**IMPORTANT:** To make Papyrus actually register and use the generated profile/model element classes in the compiled tool:
- Right-click the `[your_profile].profile.uml` and press "Open".
- Open the top-most root element and left-click the ``<<Epackage>> <Profile> [your_profile]``-node.
- In the "properties view", ensure that the following fields are filled out:
    - EPackage ==> "Base Package", "Ns Prefix", "Ns URI", "Package Name", "Prefix".
    - UML ==> "Name", "Qualified Name", "URI".
    - (You can use the ACS profile as reference if need be.)
        - (See the "Plugin Configuration" below to see more about that "URI" wrt. the Profile).
- The classes should now be available for use in the compiled tool.

`model/model.elementtypesconfigurations`: Descriptions of all ACS elements used to reference these elements in configuration (non-coding) settings (as far as we can tell).

To generate a `.elementtypesconfigurations`-file for you model, do the following:
- Open the profile (in the diagram/profile editor) in Eclipse Modeling Tool.
- Put Eclipse Modeling Tools into the "papyrus" perspective (see the "Perspective"-plugin for more detail).
- Right-click the root-element in the Model Explorer (to the left in the GUI) and go to "Generate Tooling Model > Element Types...".
- In the ensuing pop-up, choose file name and location and press "Finish".


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the `plugin.xml`-file. 

This plugin contains four (4) "extensions":

- The first extension registers the auto-generated files from the `src-gen` folder for inclusion in Papyrus. it does so by referencing the `AcsProfilePackage.java`, which seems to act like a descriptor of the generated code package.

- The second extension registers the URI `pathmap://ACS_PROFILES/` as a shorthand for `platform:/plugin/org.eclipse.papyrus.acs.profile/model/`. (We are unsure why/if this is necessary, but it is used by the following two extensions and it works.)

- Through the profile-diagram-editor in Eclipse Modeling Tool, the ACS profile is given the URI `http://Papyrus/AcsProfile`. The third extension of the plugin registers this URI in Papyrus as a "generated package" and points the URI to the XML element `pathmap://ACS_PROFILES/model.profile.uml#_ztJ-oKj4Eeyv8euO_1z7mA`, where `_ztJ-oKj4Eeyv8euO_1z7mA` is the XML-id of the profile-element in the `model/model.profile.uml`-file. 

- The fourth and last extension simply registers that the ACS Profile itself exists.


## Dependencies
This plugin does not depend on any other plugins. Although, many plugins (indirectly) depend on this plugin.

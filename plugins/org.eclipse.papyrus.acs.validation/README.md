# Validation Plugin
The "Validation Plugin" provides validation/verification features for ACS models. When right-clicking on an ACS-provided diagram and pressing "Model validation > Validate model", the models is tested agains the constraints defined in this plugin and any failed constraint check results in an error in the "Model validation" view in the ACS tool's GUI.


## Notes about plugin structure
Due to an initial lack of understanding regarding how Papyrus' validation plugin system works, we've ended up with a slightly irregular (but working) way of implementing constraints for ACS models.

Normally, each individual constraint (e.g., "Atomic System must have a Port", "All states must be reachable", "Types cannot be circularly defined", etc.) would be configured separately in the `plugin.xml`-file. In this way, each constraint gets its own severity, implementation-language, implementation-location (e.g., a Java class), and more. Along with the "Constraint Implementation", each constraint also gets a "Validation Selector" which checks if a model object should be tested against the constraint.

In our case, all constraints for all ACS model elements are implemented under a single constraint called "Structural Verification", which is implemented in the `src/org.eclipse.papyrus.acs.validation/StructureValidation.java`-class. The `StructureValidationSelector.java`-selector in the same folder select the model object of type `PackageImportImpl`, which for some reason passes all model elements in the entire ACS model to the `StructureValidation.java`-constraint. `StructureValidation` then iterates through all "ACS constraints" implemented in the classes throughout the `src/org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.*`-folders, and test all model elements against the ACS constraints (zero or more), that apply to each element.

The "front-end effect" of this is that all errors for each individual model element are concatenated into one, since one "Papyrus constraint" (i.e., `StructureValidation.java`) can only output one error per model element.

The "back-end effects" of this are that only one constraint is actually registered in the plugin, and instead of Papyrus sorting which model elements goes to which constraints, the user-code handles this instead. Also, the one registered "Papyrus constraint" (i.e., `StructureValidation.java`) can only output "errors", so a "warning" would require registering a new plugin.


## Files and folders
`src/org.eclipse.papyrus.acs.validation/`: For one, this folder contains the constraint- and selector-classes (see above) used for structural verification of ACS models. Additionally, it contains the `Utils.java`-class, which lists different ACS element types, the various available ACS constraints, and more.

`src/org.eclipse.papyrus.acs.validation.Constraints.Functions/ConstraintInterface.java`: The interface defined in this file forms the base of every implemented ACS constraint, all of which can be found in the `src/org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.*/`-folders. The interface defines a method to check if the constraint applies to some model element, and a method for testing a model element.

`src/org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.*/`: These folders contains implementations of the `ConstraintInterface`-interface for ACS constraints.


## Plugin Configuration
All configuration and integration of the plugin into Papyrus/Eclipse happens in the `plugin.xml`-file. 

The plugin-file contains two extensions:
- The first extension `org.eclipse.papyrus.acs.constraintProviders` registers
    - A category of constraints, which will show up in certain menus in Papyrus/ACS tool.
    - A "(constraintProvider)" (separate from the top level), which lists all new/added constraints. This further contains:
        - One or more "package"-elements, where a "package" provides "model elements". This could, e.g., be the AcsProfile-package or the UML2-package. In our case, we use the UML2-package, since the objects created from the stereotypes added by the ACS profile does not **DIRECTLY** contain "location/nesting/parent" information about where they are placed in the model, so the "Path" and "Element" columns in the "Model validation" view would be empty if we used the AcsProfile-package directly. To access the ACS-related information, we use the `Element.getStereotypeApplications()` call on the UML objects to get the ACS element objects that are layered on top of the UML elements they extend.
        - An addition of a constraint to the "ACS Validation"-category defined above.
            - This further defines the "Structure Validation"-constraint and associated implementation-class and other information.
                - Finally, the "(message)" element defines a "format string" for how to format the error/warning/etc. text when a constraint is broken. E.g., "The element {0} breaks the A constraint because {1}", would require a "failure function call" as such `context.createFailureStatus(elementName, reason)` (see `StructureValidation.java` for more info).
- The second extension registers `StructureValidationSelector.java` as a validation selector and further "binds" this selector to the "Structural Validation" constraint defined in the first extension.


## Dependencies
This plugin depends on the generated ACS model element classes (from the `src-gen/`-folder) from the "Profile"-plugin.


## Future works
Not all af ACS' structural verification has been implemented yet, and there are also a few errors in the current constraint implementations. Also, no dynamic verification has been implemented yet. In the future, these should be properly completed.

<!-- // Copyright 2022 ACS
//
// This file is part of ACS
//
// ACS is free software: you can redistribute it and/or modify it under
// the terms of the GNU General Public License version 3 as published by the
// Free Software Foundation.
//
// ACS is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
// or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
// Public License for more details.
//
// You should have received a copy of the GNU General Public License along
// with ACS. If not, see http://www.gnu.org/licenses/.
//
// Contributors: 
// Emil Palmelund Voldby
// Jonas Madsen
// Sean Kristian Remond Harbo
// Michele Albano
//
// Original repository: https://github.com/acs-modeling-tool/acs-modeling-tool -->

# Quick Start Guide
## Intended Purpose
This guide is intended to provide a simple introduction to help you create and validate your first ACS model. This guide assumes no prior knowledge of Eclipse or Papyrus, experienced modelers can skip this document and consult the documentation as needed.

## Create a model

### Open the Structure Diagram
 When the project was created it also placed an empty ACS model in the *Models* folder. Open the model by double-clicking the model in the *Project Explorer*.
### Open the structure view
Open the structure view by clicking the Structure View under View in the upper right corner.
### Create a SoI
Create a *SoI* component by clicking on SoI on the right-side panel called *Palette*. Place the SoI in the diagram by clicking anywhere in the empty area to the left of the palette. Resize the SoI to fill most of the available screen.

### Try Validation
Right click on the placed SoI component *Validation* -> *Validate model*. An error should now appear in the *Model Validation* view at the bottom of the screen. The message informs you that the SoI must contain at least two *systems*.
### Remove the Error
Click the *error* and press the *DEL* key. Alternatively right-click the error and choose delete.

## Make the model valid

### Fix "Must Contain at least two systems"
Place two *Atomic Systems* from the palette inside the SoI If you validate again the previous error will no longer appear, but other errors might appear.

### Fix "Atomic System must have exactly one port"
Place a port on the Atomic system.

### Fix "Must have cardinality" 
Click on Atomic System, Click the Properties tab at the bottom, Click the ACS tab Input a cardinality (e.g. '1').

### Fix "Missing connection"
Add a *Link Holder* in SoI. Put a *Link Hub* on the Link Holder. Create a *Link Connection* from a port to the Link Hub.

### Fix "Link cardinality missing"
Click the Link Connection, Click the Properties tab, Click the ACS tab, Input a cardinality (e.g. '1').

### Fix "Link hub must have an either self-referential or active connection"
Click the Link Connection Click the Properties tab, Click the ACS tab, Change the *Directionality* to "active" from the drop-down.

## Model correctness
The model is validated as good when no further errors are added to the log upon validating the model as mentioned above. If you followed the chain of errors and solutions presented above you should now have an ACS model that validates correctly. This is the end of the introduction to this tool.

## Closing notes
There are many more rules, diagrams, and functionality not explored here. For a complete list of all possible errors and the rationale behind making that configuration an error, please see the full documentation.

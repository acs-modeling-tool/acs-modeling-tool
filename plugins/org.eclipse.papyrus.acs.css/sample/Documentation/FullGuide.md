# Full Guide
This guide assumes you have good understanding of modeling in Papyrus and thus this guides main focus is on the ACS specific Components and the rules that govern their use.

## Errors
This section presents all the errors that might be presented to a modeler upon validation, their rationale and elements they apply to. These sections are generated from the implementation so they might change often. 

### Must have exactly one Port.
Atomic Systems need exactly one Port.
If you give them zero ports they can't communicate with anything and thus meaningless.
If you want to give them two or more ports you should use a composite instead since that is the composites purpose.
If an Atomic System could hold multiple ports it suggest that there are actually two systems inside the atomic system,
and that would make the idea of an Atomic System moot.
#### Applies to 
AtomicSystem


### Cannot have digit as first character in name.
For implementation and compliance reasons we have chosen to disallow this.
#### Applies to 
ACS_Model
SoI
Composite
AtomicSystem
Reference
Port
LinkConnection
InterfaceConnection
Controller
CONStartState
CONIntermediateState
ActionTransition
InvocationTransition


### Must contain at least two Systems otherwise abstraction is redundant.
If the abstraction doesn't contain at least two systems the abstraction should be represented by Atomic System instead.
#### Applies to 
SoI
Composite


### Port(s) doesn't match the hosts Port(s).
If the Reference Port(s) doesn't match the referenced SoI.
Then the reference wouldn't be faithful to the Implemented SoI
#### Applies to 
Reference


### Must have at least one Port.
Composites must have at least one Port.
If you give them zero ports they can't communicate with anything and thus meaningless.
You can give them more ports as they can combine multiple systems in their abstraction.
#### Applies to 
Composite


### Referenced SoI must be set.
Empty referenced SoI is not allowed (What default behaviour did you expect from this?).
#### Applies to 
Reference


### Must have a System Cardinality.
A System needs a cardinality for validation.
#### Applies to 
Composite
AtomicSystem
Reference


### must_have_connection
Dead ends are not allowed, just delete the connection.
#### Applies to 
Port


### Must be placed between Port and Link Hub.
Link Connection must be between Port and Link Hub.
This enforces explicit design for communication.
#### Applies to 
LinkConnection


### link_cardinality_not_greater_than_system_cardinality
We enforce some rules on Link Connections since they are obviously bad.
If you put a Cardinality of 5 on some Atomic System (i.e. You have 5 of this system).
Then it wouldn't make sense to say that 6 of these five systems talk over the connection.
If you put a Cardinality of 2 on some Atomic System (i.e. You have 2 of this system)
Then it wouldn't make sense to say that two of these Systems talk to themselves (i.e. self referential)
Since the initiating system would need to part of the Reacting systems.
#### Applies to 
LinkConnection


### Must have a Interface Connection.
Rationale missing for now.
#### Applies to 
Port


### Cannot cross a System boundary.
Link Connections should only make dependencies between Systems in their scope.
You should use the Interface Connections to talk out of and into Systems, this is to enforce a cleaner structure.
#### Applies to 
LinkConnection


### Must be connected to Port on container System.
Interface Connections must be connected to the Port on a Container system (i.e. Composite or SoI).
The other end must be connected inside the Container.
#### Applies to 
InterfaceConnection


### Must be connected to Atomic System.
Interface Connections must be connected to an Atomic System.
This system is referred to as the Interface System.
#### Applies to 
InterfaceConnection


### Must have either Self referential or Active connection.
Rationale missing for now.
#### Applies to 
LinkHub


### Port and InterfaceConnection must have same parent.
This is true when the connected Atomic System is inside the Container (i.e. Composite or SoI).
#### Applies to 
InterfaceConnection


### Only Interface systems can have Active or Self referential connections.
Rationale missing for now.
#### Applies to 
LinkHub


### Needs at least one other connection due to its Active connection
Rationale missing for now.
#### Applies to 
LinkHub


### All states must be reachable.
An unreachable state is useless and only adds confusion.
#### Applies to 
Controller


### Dead end is not allowed.
A dead end is not allowed, must lead to another state.
#### Applies to 
Controller


### You have two or more initial states, exactly one is required.
We only support exactly one initial node.
#### Applies to 
Controller


### Must have a source and target.
Cannot have transition with no source or target.
#### Applies to 
ActionTransition
InvocationTransition


### Must have at least one transition.
Must have at least one transition.
#### Applies to 
Controller


### Must be none cyclic.
Must be none cyclic.
#### Applies to 
Machine



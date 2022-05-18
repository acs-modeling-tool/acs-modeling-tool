# Structural phases

The goal of this document is to take the full document for the first structural analysis phase and rewrite it into something human readable.

Planned phases:

1. Independent structural check
2. Referential integrity check

## First phase

The first phase is responsible for ensuring that every node in the AST are independently valid. That is, that all details that are not dependent on other systems but only themselves are valid. Eg. that a link has a valid number of connections, though not whether the actual connected systems exists, which are instead handled by the following phase. Most of these details are about integrity of the model.

### Unsorted comments

- At least 1 Interface on composites
- 2 SSMs in a composite
- Names resolve to something
- Ref SoI name is in dependency
- max 1 link connection from any single link to any AS/port
- Min 1 sender in a Link 
  - can be an active connection or a self-referential connection. This affects the total required 
- min 1 sender on a link
- all link sender has receiver
- check if blank CAR is valid
- check link-car is valid, check link-car on ref boundary-link
- SoI must have 2 ssms
- Only interfaces initiate on boundary-link
- ports are backed by AS?
- AS must have at least one event
- EV input output must be single, void, or type list
- Subs subscribe to existing pub
- com must be non-cyclic
- func must have input or output non-void
- mac can be void -> void
- event can be void->void
- mac min 2 state + 1 transition
- mac 1 start and >= 1 end states with the same num/typ of output var and token
- all states (other than start and end) must have ingoing and outgoing transitions
- name integrity
- many msg => many tgt
- (no recursion in any way
- Support machines have no tokens
- Mac output must match typ and tkt
- controller must be cyclic
- name referential integrity on sub
- controller must have at least 1 state and at least 1 transition
- except for the start controller state, all states must have both start and end state?
- Con correct number of token in and out on actions
- state name integrity controller

### Sorted Comments

Remember to mark which comments affect an environment

#### Environments

$$
EnvSY |= qname \rightarrow [BND-LNK_s, INT_s, LNK_s, SSM_s] (SoI) \\
\cup [BND-LNK_s, INT_s, LNK_s, SSM_s, CAR] (COMP)\\
\cup [CAR, SoI, LNK_s] (reference)\\
\cup [EDCL_s, LNK_s, TNK_s, CAR, CON] (AS)
$$

$$
EnvL|= qname \rightarrow [\overrightarrow{port, car, CTP}]
$$


$$
EnvTY|= qname \rightarrow [TBB, CST, AS, AS_s] \cup [TBB, CST]
$$






#### Model

#### System of Interest

- SoI must have 2 ssms
- ports are backed by AS?

#### Composite

- At least 1 Interface on composites
- 2 SSMs in a composite
- ports are backed by AS?

#### Reference

- Ref SoI name is in dependency

#### Atomic System

- AS must have at least one event
- EV input output must be single, void, or type list
- Subs subscribe to existing pub

#### Controller

- Only interfaces initiate on boundary-link
- controller must be cyclic
- controller must have at least 1 state and at least 1 transition
- Con correct number of token in and out on actions

#### Communicator

- com must be non-cyclic
- func must have input or output non-void
- mac can be void -> void
- event can be void->void

#### Machine

- mac min 2 state + 1 transition

- mac 1 start and >= 1 end states with the same num/typ of output var and token
- all states (other than start and end) must have ingoing and outgoing transitions
- many msg => many tgt
- no recursion in any way (soft for now)
- Support machines have no tokens
- for transition; check that lock is followed in all paths by an unlock.

#### Link

- max 1 link connection from any single link to any AS/port
- Min 1 sender in a Link 
  - can be an active connection or a self-referential connection. This affects the total required 
- all link sender has receiver
  - whether that be itself or another, depends on type
- check if blank CAR is valid
- check link-car is valid, check link-car on ref boundary-link

## Second Phase

The second phase is responsible for handling any and all verification of structural details which refer to other nodes or are dependent on knowledge about them.

Note that in the planning of this stage, details are changed in how the environments are structured as details that are needed here are added onto them or changed to be usable.

#### Model

- That all dependencies are included in the model

#### SoI

- Actually nothing? Interfaces and boundary links have already been integrity-checked.

#### Composite

- Boundary System names and interface names have already been checked. Nothing to do here.
- Car is first used by link.

#### Reference

- Check that dependency exists and that it is in our list.

#### Link

- Check that ports are existing systems
  - Check first if boundary link
- check that system and link cardinalities match.
  - z+ and system
  - N and system
  - \* and system
  - null and system
- Need to check that all AS use the link in an event.
  - Has self-referential or active link connection
    - has publisher, handler with invocation, initiator with this link.
      - contains communicator
        - contains invocation using another system
        - if self-referential, contains usage of own instance 
  - This must check that everyone are communicated with (if not active) and all actives must start some communication.

#### Atomic System

- Types are still left alone. Just registered last phase for future usage.
- Cardinality was handled by link
- Just controller and event decl?

#### Controller

- Goal is to check actions, the usage of tokens, and state uses. Remember that some can not have machines and will be thus different.
  - Token count fit event
    - Just count, and type-check.
  - Token survivability/usability
    - Get path(s) from definition action to here; check that they allow the token
  - Action
    - time
      - check that state must have been entered beforehand (i.e. no ambigurity)
    - invoked
      - sub: already handled. Checked that publisher is on link elsewhere, and checked link connecter there.
      - initiator/handler: 
        - Already checked that we are on link. Nothing else?

#### Event Decl

- If subscriber, check that publisher exists and is on link
- if has com, check it.

#### Communicator

- check that parent is on link and active. (active part can be handled)
- Check that token types are systems on link.
- No need to check functions
- Check bi-machine
- Check main machine
  - invocation: check that can connect, that medium and id is valid given cardinality
    - if pub: nothing
    - if: X2M: Check that cardinality supports it on target link connection.
    - Check that ID is compatible with link cardinality.
      - Check that token is right
- output token, check that it is the "type" is right.

#### Machine
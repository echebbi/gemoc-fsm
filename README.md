# Executable Finite State Machine

## Motivation

This project is aimed to experiment with [GEMOC Studio](http://gemoc.org/studio.html).

More specifically, the goal is to create a graphical editor based on [Sirius](https://www.eclipse.org/sirius/) that makes able to edit a Finite State Machine (FSM). Futhermore, it must be possible to simulate a FSM's execution thanks to GEMOC's Model Animator.

## Implemented features

##### Model

- [x] ECore meta-model
- [x] Nested FSM
- [ ] Introduce a _terminal_ state 

##### Execution

- [x] Step-by-step CLI execution
- [x] Step-by-step UI execution

##### Representation

- [x] Diagram representation
- [x] Diagram editor
- [x] Tailored Properties view

## Implementation

The [Wiki](https://github.com/KazeJiyu/gemoc-fsm/wiki) sums up the implementation of such a FSM and describes how to use GEMOC. This is _not_ a tutorial, rather a capitalization of my experience on using GEMOC Studio.

The different projects present in this repository are:

- `ice.master.fsm.model`: defines the ECore meta-model of a FSM ;
- `ice.master.fsm.semantic`: defines the [Kermeta 3](http://diverse-project.github.io/k3/index.html) Aspects describing a FSM's behavior ;
- `ice.master.fsm.xdsml.*`: defines the xDSML used by GEMOC's Model Animator ;
- `ice.master.fsm.design`: defines the Sirius Representation of a FSM.

## Use this project

### Table of Contents

* [1. Choose the right GEMOC Studio](#1-choose-the-right-gemoc-studio)
* [2. Clone the repository](#2-clone-the-repository)
* [3. Import the projects](#3-import-the-projects)
* [4. Open a second GEMOC instance](#4-open-a-second-gemoc-instance)
* [5. Create a new FSM](#5-create-a-new-fsm)
* [6. Execute the FSM](#6-execute-the-fsm)
* [7. Debug the FSM](#7-debug-the-fsm)

### 1. Choose the right GEMOC Studio 

At the time of writing, the latest version of GEMOC Studio is the `3.0.0-SNAPSHOT`. Since it is a SNAPSHOT, the product evolves over time and some versions are more stables than overs.

The different versions are build by Jenkins, and I found out the [build #33](https://ci.eclipse.org/gemoc/job/gemoc-studio/job/master/33/artifact/gemoc-studio/gemoc_studio/releng/org.eclipse.gemoc.gemoc_studio.product/target/products/) to be pretty stable. Since [Melange](http://gemoc.org/gemoc-studio/publish/guide/html_single/Guide.html#section-melange-editor) is not currently really trustworthy I strongly advise you to use this version of GEMOC. 

### 2. Clone the repository

To use the projects, you must clone this repository locally. You can either use Eclipse's EGit or type the following command in your terminal:

`git clone https://github.com/KazeJiyu/gemoc-fsm.git`

### 3. Import the projects

Open GEMOC Studio, then import the projects with `File > Import ... > Existing Projects into Workspace`.

### 4. Open a second GEMOC instance

In order to use the plug-ins defining a FSM, a second GEMOC Studio has to be run. To this end, go to `Run > Run Configurations ...`. Create a new _Eclipse Application_ then click `Run`.

### 5. Create a new FSM

First of all, create a new project: `File > New > Other... > Ecore Modeling Project`.

Then, create a new FSM Model: `File > New > Other... > Model Model`. 

> Caution: the name is not really explicit, it should be changed soon.

The new file should open with the XML Editor. Close it, then right-click on the file to open it with the _Model Model Editor_. 

You can now populate the FSM by right-clicking on the root and add new children. Their attributes can be edited through the _Properties view_.

### 6. Execute the FSM

Go to `Run > Run Configurations...` and create a new _Gemoc Sequential eXecutable Model_.

You must fill the following fields:

- _Model to execute_: the path to the .fsm file defining the FSM to execute ;
- _Melange language_: should be `ice.master.fsm.xdsml.FSM` ;
- _Main method_: should be `public static void ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspect.main(ice.master.fsm.xdsml.fsm.model.FiniteStateMachine)` ;
- _Main model element path_: the FSM to execute, should be `/` after validation.

Finally, click `Run` to launch the execution.

> Note: to trigger a Transition, a FSM expects events. An event is merely a string that you can send by typing it into the original GEMOC Studio's console.

### 7. Debug the FSM

Go to `Run > Debug Configurations...` and create a new _Gemoc Sequential eXecutable Model_.

Fill the same fields than previously as well as the following ones:

- Check `Break at start` to tell GEMOC to run the FSM step-by-step.

> Note: to benefit from the MultiDimensional Trace view, you must open the Engine Addons tab and check Generic MultiDimensional Trace.

### 8. Create a representation of the FSM

From the _Model Explorer_, right-click on the root of the FSM, below the .fsm file and select `New Representation`.

The new representation should be created in the .aird file and open in the diagram editor.

### 9. Debug the representation of the FSM

You can debug a FSM with the help of a visual support by following the steps specified in [Execute the FSM](#6-execute-the-fsm). The only change is to fill the _Animator_ field with the path to the .aird file containing the FSM's representation.

## Useful links

The following links provide useful informations about GEMOC Studio and its use:

- [A complete guide about GEMOC](http://gemoc.org/gemoc-studio/publish/guide/html/Guide.html)
- [GEMOC's Guide Quick Tutorial](https://github.com/gemoc/gemoc-studio/wiki/GuideQuickTutorial)
- [A tutorial about how to create an executable Marked Graph](http://gemoc.org/gemoc-studio/publish/tutorial_markedgraph/html_single/GuideTutorialMarkedGraph.html#_set_up_an_xdsml_project)
- [Kermeta 3's user documentation](http://diverse-project.github.io/k3/publish/user_documentation/html_single/user_documentation.html)
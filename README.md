# Executable Finite State Machine

## Motivation

This project is aimed to experiment with [GEMOC Studio](http://gemoc.org/studio.html).

More specifically, the goal is to create a graphical editor based on [Sirius](https://www.eclipse.org/sirius/) that makes able to edit a Finite State Machine (FSM). Futhermore, it must be possible to simulate a FSM's execution thanks to GEMOC's Model Animator.

## Implemented features

- [x] ECore meta-model
- [x] Step-by-step CLI execution
- [x] Diagram viewpoint
- [x] Diagram editor
- [x] Tailored Properties view
- [x] Step-by-step UI execution

## Implementation

The following paragraphs sum up the implementation of such a FSM and describe how to use GEMOC. This is _not_ a tutorial, rather a capitalization of my experience on using GEMOC Studio.

## Table of Contents

* [1. Meta-model definition](#1-meta-model-definition)
* [2. Behavior definition](#2-behavior-definition)
* [3. Mix static and dynamic definitions](#3-mix-static-and-dynamic-definitions)
* [4. Instantiate a new model](#4-instantiate-a-new-model)
* [5. Executing the model](#5-executing-the-model)
* [6. Executing the model with the Model Animator](#6-executing-the-model-with-the-model-animator)
* [7. Defining a graphical editor](#7-defining-a-graphical-editor)
* [8. Debugging with to the graphical editor](#8-debugging-with-the-graphical-editor)

### 1. Meta-model definition

First of all, we have to define a meta-model defining the domain. This can be achieved easily thanks to EMF. 

A new meta-model can be created with `File > New > Ecore Modeling Project`.

Here, the meta-model defining a FSM is located in `ice.master.fsm.model/model/fsm.ecore`.

> **Important**: the meta-model should not include any method. In GEMOC, static and dynamic stuff are clearly separated. Hence, the structure of the meta-model and its data, which define how _are_ model's objects, are isolated from methods, which define how _behaves_ model's objects.  

### 2. Behavior definition


The second step is to add _semantic_ to the meta-model. The semantic corresponds to how real instances will _behave_. 

#### Create a K3 Project

In GEMOC, semantic can be added by using [Kermeta 3](http://diverse-project.github.io/k3/index.html) (K3), a language built on the top of Xtend.

To use K3, create a dedicated project with `File > New > K3 Project`.

In order to ease incoming steps, it can be handy to initialize the plug-in from a template. To this end, check the corresponding checkbox in K3's _New Project Wizard_ and select the template _User Ecore Basic Aspects with Melange_. In the last page, tailor different fields as you wish and select the ECore model defined previously. 

Here, the semantic is defined within `ice.master.fsm.semantic`.

#### Implement methods

To "inject" methods into a meta-model, we can use K3's so called _Aspects_. See:

- [FiniteStateMachineAspect.xtend](ice.master.fsm.semantic/src/ice/master/fsm/semantic/FiniteStateMachineAspect.xtend) for a concrete example ;
- [Breathe life into your metamodel](http://diverse-project.github.io/k3/) for further explanations.

> Notes:
>
> - `@Main` defines the method that is run by GEMOC when executing a model
> - `@Step` targets the methods on which GEMOC's debugger can pause
> - `import static extension` makes possible to use a method defined by an aspect within another aspect.

### 3. Mix static and dynamic definitions

#### Understand the Melange language

Now that the structure of the meta-model and the methods that specify its behavior have been implemented, it is time to assemble the two. For this purpose, GEMOC embeds [Melange](http://gemoc.org/gemoc-studio/publish/guide/html_single/Guide.html#section-melange-editor). Melange is, basically, a language making able to specify:

- a meta-model,
- some aspects that extend this meta-model,

and that generates a **new meta-model** that can be seen as the addition of the original meta-model and of the aspects. Indeed, the generated meta-model owns all the classes and parameters declared in the original meta-model as well as the the methods and the attributes specified by the aspects.

Here, the project that defines the Melange is `ice.master.fsm.xdsml`, and the projects it generates are `ice.master.fsm.xdsml.fsm.*`.

#### Create a new Melange project

A new Melange project can be created with `File > New > GEMOC Sequential xDMSL Project`.

> `xDMSL` stands for "eXecutable Domain Specific Modeling Language" and merely refers to a DSL that GEMOC is able to execute. 

In order to ease incoming steps, it can be handy to initialize the plug-in from a template. To this end, check the corresponding checkbox in the _New Project Wizard_ and select the template _Simple GEMOC sequential project_ In the last page, tailor different fields as you wish and select the ECore model as well as the K3 project defined previously.

> Caution: the name of the language defines the extension of model's files. Even if it can be changed afterwards, it is easier to type directly the desired extension. 

#### Generate the new meta-model

To generate the new meta-model, right-click on the `*.melange` and select `GEMOC > Generate All`.

This instruction tells GEMOC to generate the new meta-model, as well as all the adapters and files it needs to being able to execute a model.

> Note: the Melange file is located under `<melange-project>/src/<melange-package>`.

#### Generate new Wizards

It is convenient to dispose of tailored wizards to create new models. Such wizards can be generated easily:

1. Open the `.genmodel` located under `<melange-project>.<language-name>/model`
2. Right-click on the root of the tree
3. Select `Generate Edit Code`
4. Repeat the previous steps and select `Generate Editor Code`

### 4. Instantiate a new model

#### Create a new model

1. Launch a new GEMOC with `Run > Run Configurations... > Eclipse Application`
2. Create a new project with `File > New > New Java Project`
3. Create a new model file with `File > New > Other ... > Example EMF Model Creation Wizards > <language-name> Model`

#### Populate the model

1. Right-click on the model file: `Open with > <language-name> Model Editor`
2. Right-click on the model's root: `New Child > ...`

### 5. Executing the model

To execute a model, stay on the new Eclipse:

1. Open Run Configurations: `Run > Run Configurations ...`
2. Create a new configuration: `Gemoc Sequential eXecutable Model > New`
3. Select the `model to execute`
4. Select the `Melange language`
5. Select the `Main method` (the one annotated with `@Main`)
6. Select the `Main model element path`
7. Validate with `Run`

### 6. Executing the model with the Model Animator

To use the Model Animator, the model must be executed with a debug configuration:

1. Open Run Configurations: `Run > Debug Configurations ...`
2. Create a new configuration: `Gemoc Sequential eXecutable Model > New`
3. Select the `model to execute`
4. Select the `Melange language`
5. Check the `Break at start` checkbox
6. Select the `Main method` (the one annotated with `@Main`)
7. Select the `Main model element path`
8. Validate with `Debug`

> Note; to benefit from the `MultiDimensional Trace` view, you must open the `Engine Addons` tab and check `Generic MultiDimensional Trace`.

### 7. Defining a graphical editor

A graphical editor can be defined with Sirius. To this end, go back to the first Eclipse and:

1. Right-click on the `*.melange` file
2. Select `GEMOC Language`
3. Click on `Generate Animatior Project for language`

A new `<melange-project-name>.debug.design` project should be created. Here, it is `ice.master.fsm.design`.

This project contains a file `description/<language-name>.odesign` that can be edited to configure the graphical editor. See [Sirius Guide](https://wiki.eclipse.org/Sirius/Tutorials/StarterTutorial) for further details. A [GEMOC tutorial](http://gemoc.org/gemoc-studio/publish/tutorial_markedgraph/html/ch06.html) also shows how to set up an animation. 

### 8. Debugging with the graphical editor

#### Create the representation

Once the editor is ready, we can use it to display the model. To test it:

1. Launch a new GEMOC with `Run > Run Configurations... > Eclipse Application`
2. [Create a new Representation of your model](https://wiki.eclipse.org/Sirius/Tutorials/StarterTutorial#Test_the_diagram).

#### Launch the Model Animator

It is the same as [Executing the model with the Model Animator](#6-executing-the-model-with-the-model-animator) except that the `Animator` field must be filled with the path to the `.aird` representation file. 

## Useful links

The following links provide useful informations about GEMOC Studio and its use:

- [A complete guide about GEMOC](http://gemoc.org/gemoc-studio/publish/guide/html/Guide.html)
- [GEMOC's Guide Quick Tutorial](https://github.com/gemoc/gemoc-studio/wiki/GuideQuickTutorial)
- [A tutorial about how to create an executable Marked Graph](http://gemoc.org/gemoc-studio/publish/tutorial_markedgraph/html_single/GuideTutorialMarkedGraph.html#_set_up_an_xdsml_project)


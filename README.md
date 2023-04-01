# Patterns

> A collection of design patterns

## Introduction

With this educational project, I provide implementations of commonly used design patterns.

Below, I first describe the [aims](#1-aims) I have with the current project.
Then, I provide an [overview](#2-overview) of the design pattern implementations that are currently available.
In addition, I provide some [background information](#3-background) on the design patterns I focus on in this project.

## 1. Aims

My aims with this project are to:

- Build up knowledge of design patterns.
- Learn how these design patterns can be implemented.

More generally, I strive to:

- Gain experience with different programming languages.
- Get to know the specifics of these languages.

Finally, I aim to:

- Showcase this experience and knowledge.

## 2. Overview

Currently, implementations of commonly used design patterns are available in the following languages:

- [Java](java)

More specifically, I provide the following design pattern implementations:

| Design pattern | Java                                                             |
|----------------|------------------------------------------------------------------|
| Singleton      | [✅](java/src/main/java/nl/mauritssilvis/patterns/java/singleton) |

## 3. Background

More information on the [creational design patterns](#31-creational-design-patterns) I focus on in this project is given in what follows.

### 3.1 Creational design patterns

#### 3.1.1 Singleton

The singleton design pattern could well be the most well-known design pattern.
The basic idea of this pattern is to ensure that there is only a single instance of a particular class.
Any attempts to retrieve or create another instance of this class lead to this same object.
This object, which could be called a singleton instance, thus, acts as a global.

The use of a global singleton object can be practical in several situations.
Think, for example, of an object that should store the global configuration of an application or an object that should manage access to external resources such as databases or files.

It should be noted, however, that the singleton design pattern is often criticized.
For one thing, singletons break the single-responsibility principle.
Next to the application-related tasks they are given, they are responsible for their creation.
Secondly, global objects that persist in time are notoriously hard to test since they may cause (unit) tests to interfere with each other.

For completeness, I do include implementations of the singleton design pattern in this project.

## License

Copyright © 2022, 2023 Maurits Silvis

This source code package is subject to the terms and conditions defined in the GNU General Public License v3.0, which can be found in the file [LICENSE.md](LICENSE.md), or later.

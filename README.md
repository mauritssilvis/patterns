# Patterns

> A collection of design patterns, implemented in different programming languages

## About

With this project, I provide implementations of commonly used design patterns in different programming languages.

## Aims

My aims with this project are to:

- Build up knowledge of design patterns.
- Learn how these design patterns can be implemented.

More generally, I strive to:

- Gain experience with different programming languages.
- Get to know the specifics of these languages.

Finally, I aim to:

- Showcase this experience and knowledge.

## Status

Currently, implementations of commonly used design patterns are available in:

- [Java](java)

## Background

In this project, I currently focus on the following design patterns.

### Singleton

The singleton design pattern could well be the easiest and most well-known design pattern.
The basic idea of this pattern is to ensure that there is only a single instance of a certain class.
Any attempts to retrieve an(other) instance of this class should again lead to this same, single object.
This object, which could be called a singleton instance, thus, acts as a kind of global.

The use of a global, singleton object could be practical in several situations.
Think, for example, of an object that should store the global configuration of an application or an object that should manage access to external resources such as databases or files.

It should be noted, however, that the singleton design pattern is also often criticized.
For one thing, singletons break the single-responsibility principle.
Next to the tasks they are given, they are responsible for their own creation and lifetime.
Secondly, global objects that persist in time are notoriously hard to test since they may cause (unit) tests to become dependent on each other.

For the sake of completeness, I did include the singleton design pattern in this project.

## License

Copyright © 2022 Maurits H. Silvis

This source code package is subject to the terms and conditions defined in the GNU General Public License v3.0, which can be found in the file [LICENSE.md](LICENSE.md), or later.

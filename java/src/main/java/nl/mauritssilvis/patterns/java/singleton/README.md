# Patterns > Java > Singleton

> The singleton design pattern implemented in Java

## Introduction

With this part of the [Patterns](https://github.com/mauritssilvis/patterns) > [Java](../../../../../../../..) project, I provide implementations of the singleton design pattern in Java.

In what follows, I give an overview of [sound](#1-implementations) and [faulty](#2-faulty-implementations) implementations of this design pattern.

For general information about the singleton design pattern, refer to the [singleton section](../../../../../../../../../README.md#311-singleton) of the general [project readme](../../../../../../../../../README.md).

## 1. Implementations

There are two common ways to implement the singleton design pattern in Java.

### 1.1 A class with a private constructor

The first implementation relies on using a `private` constructor, a `static` class instance and a `static` method for retrieving this instance.

The file [Singleton.java](hide/general/Singleton.java) contains an abstract version of such a singleton implementation:

```java
package nl.mauritssilvis.patterns.java.singleton.hide.general;

public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
```

Unit tests verify the singleton nature of the above class.

I used eager initialization of the singleton instance to guarantee thread safety without additional checks.
Additionally, the keyword `final` is only applied to the class to remind us that extending a class with a private constructor is impossible.
This keyword is not essential for the singleton pattern.

A specific singleton implementation that makes use of a private constructor and that represents a global configuration class is provided by the file [Configuration.java](hide/specific/Configuration.java).

### 1.2 An enum

Another Java implementation of the singleton design pattern benefits from the property that `enum` values are unique.

An abstract version of such an implementation is given by another file called [Singleton.java](enumerate/general/Singleton.java):

```java
package nl.mauritssilvis.patterns.java.singleton.enumerate.general;

public enum Singleton {
    INSTANCE
}
```

Again, unit tests verify that an `enum` forms a valid implementation of the singleton pattern. 

A specific singleton implementation of the `enum` type is given by [Configuration.java](enumerate/specific/Configuration.java). 

## 2. Faulty implementations

Next to sound singleton pattern implementations, one can encounter classes that may look like but, strictly speaking, are not singletons.

### 2.1 A class with a protected constructor

A particular example of a faulty singleton implementation is given by classes using a `protected` constructor.
Although `protected` constructors serve the purpose of making class extension possible, they also allow child classes and classes that are part of the same package to instantiate additional objects.

An abstract version of a faulty singleton implementation is given by the file [NoSingleton.java](protect/general/NoSingleton.java):

```java
package nl.mauritssilvis.patterns.java.singleton.protect.general;

public class NoSingleton {
    private static final NoSingleton INSTANCE = new NoSingleton();

    protected NoSingleton() {
    }

    public static NoSingleton getInstance() {
        return INSTANCE;
    }
}
```

Unit tests verify that child classes and classes within the same package can create additional class instances.

## License

Copyright © 2022, 2023 Maurits Silvis

This source code package is subject to the terms and conditions defined in the GNU General Public License v3.0, which can be found in the file [LICENSE.md](../../../../../../../../LICENSE.md), or later.

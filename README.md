# lib-design-patterns

## Description
This is only some patterns that, it is no means a exhausted list.

## Technologies
- c# - compiled and built on monodeploy
  - Framework 4.7
- java
  - openjre 11
- javascript
  - es6
- php
  - 7.2
- python
  - 3.x

## To run
### csharp
Reference common-dotnet-lib/HelloWorld.dll

### java
Reference common-jars/java.core.helloworld.zip
and add common-jars/java.maven.repo.local.zip to your local maven repo.

### javascript
Its best to run these with npm-cli.

## Builder
Lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

## Decorator
Lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

## Observer
Lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they're observing.

## Pipe
I'm not sure where this fits but it does make code look cleaner. The
vasic idea is this:
`Psuedo code`
> Create a class that holds a list of function pointers

> Iterate through the list passing the result from the previous function

## Singleton
Lets you ensure that a class has only one instance, while providing a global access point to this instance.

## Strategy
Lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

## Template
Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## Reference
https://refactoring.guru/design-patterns/csharp
I took most of the definisions from this site.

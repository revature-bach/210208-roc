# Inheritance
Inheritance is the process by which classes, and thus, objects, can **inherit** the state and behavior of other classes. The class that other classes inherit from is known as a **base/parent/super** class, while the class that inherits from another class is called the **child/sub**-class.

## Terminology
- Base/Parent/Super class: the class from which other classes inherit from
- Sub/Child class: the class that inherits from another class
- IS-A relationship: A class that inherits from another class forms an IS-A relationship with the parent class. (ex. A Dog is an Animal)

In Java, all **NON-private** fields and methods are inherited from a parent class. The Dog class, therefore, will have access to all of the public/protected/default field and methods.

The main benefit with inheritance is in re-usability of code. By using inheritance, we don't need to redefine common properties everytime for different classes, instead we can just inherit from another class that provides these properties. 

So this allows us to abide by DRY (don't repeat yourself).

# Polymorphism
Polymorphism means "taking on many forms". In the context of programming, polymorphism describes how objects can behave differently in different contexts. In Java, this comes often in the form of the following:
- Method Overloading (compile-time polymorphism)
- Method Overriding (run-time polymorphism)

## Method Overloading
This describes the case where there are two or more methods in the same class with the same method name, but different method signatures in the form of the parameters.

It is called **compile-time** polymorphism because the parameter/argument list is already known at compilation. Behind the scenes, the compiler already can differentiate between which method will be invoked, because these, despite having the same name, are different methods entirely.

## Method Overriding
Method overriding describes the case in which a child class has the same method signature as a method in the parent class. However, this method in the child class can have a different implementation. Child classes can change the default behavior, which makes class hierarchies and inheritance more flexible and dynamic. Method overriding is considered **runtime polymorphism**.

When overriding a parent method in a child class, the method must:
- Have a covariant return type
    - the return type must be the same or a subclass of the return type in the parent method
- The same method name
- The same method parameters
- The same access modifier or more access

## Covariant Return types
When we override a method, we can actually change its return type, as long as the return type is a **subclass** of the original return type.

# Encapsulation
The principle in OOP of
1. Containing related state and behavior together inside a class
    - Can help us adhere to the Single Responsibility Principle (SRP)
2. Hiding and preventing change to an object's data members
    - Prevents arbitrary external changes that could cause an object to be in an invalid/inconsistent state
        - e.g. imagine we have a Person class, and some code arbitrarily changes a Person object's age to a negative value

Encapsulation introduces the idea of **getter** and **setter** methods. Getter methods are used to access private members from outside, while setter methods would allow us to modify these members from outside. Access to the getter and setter methods themselves are also controlled by access modifiers. Usually these getters and setters might be `public`.

# Abstraction
Abstraction is a principle in which we centralize common characteristics and generalize behavior into conceptual modules. By utilizing abstraction, we hide underlying implementation. For example, when we drive a car, we don't need to know how the car works, we only need to know how to use the accelerator, brakes, and steering wheel. The car abstracts away the internal details of timing, engine cycles, transmission, cooling, and other functions.

## Abstract Classes
In Java, we achieve abstraction using abstract classes and interfaces. Abstract classes are classes declared using the `abstract` keyword that cannot be instantiated. Abstract classes essentially serve as templates for other classes to extend from `concrete classes`. Within abstract classes there can be both **abstract methods** and **concrete methods**. Abstract methods must be implemented by the concrete subclasses that extend the abstract class. An abstract class can contain instance fields and concrete methods just like ordinary classes.

The primary differences, as summarized:
- Abstract classes cannot be instantiated
- Abstract classes can have abstract methods

## Interfaces
Interfaces cannot be instantiated like abstract classes. They serve as contracts for methods that a class must implement. To inherit from interfaces, classes use the `implements` keyword to implement the interface. Classes that do this are forced to actually override these methods defined in the interface and provide some sort of code in the method body. 

Multiple interfaces can be implemented by a class. However, you cannot extend multiple classes, only one class. This is one of the reasons you might use interfaces instead.

There are also plenty of other differences as well. 
- Interfaces can have variables, but they are implicitly set to `public`, `static`, and `final`, so no instance fields can be defined in an interface unlike an abstract class.
- Before Java 8, interfaces could only contain abstract methods
    - However, since then, the `default` keyword could be used with a method in an interface to allow you to provide an implementation directly in the interface
    - The purpose of this is to not break old classes that might be implementing an interface whenever you add new methods to that interface
- Interfaces can contain static methods

Interfaces have a lot more restrictions than abstract classes, because one of the reasons is to actually allow for multiple interfaces to be implemented for a class. The issue with multiple inheritance in Java is ambiguity that can arise if two classes had the same method name, since Java would not know which one to inherit.
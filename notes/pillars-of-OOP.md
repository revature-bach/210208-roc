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

# Java: Annotations
Java annotations are special constructs that may be seen throughout Java code. Annotations use the `@` symbol followed by the annotation name. They are used to provide metadata about source code to the compiler and/or JVM. They can be placed on classes, methods, fields, and other constructs depending on how these annotations were defined.

One of the primary purposes of annotations is to enforce rules in the code or to abstract away some functionality provided by a framework (for example, Spring framework). Annotations are often processed using Java's built-in `Reflection API` to dynamically provide functionality for developers.

You should be familiar with a few built-in annotations:
- `@Override`: declares that a method must override an inherited method
- `@Deprecated`: marks a method as obsolete
- `@SuppressWarnings`: instructs compiler to suppress compilation warnings
- `@FunctionalInterface`: designates an interface to be a functional interface
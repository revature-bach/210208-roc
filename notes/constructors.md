# Java: Constructors
When we use the new keyword to create an object, the JVM invokes a special class member called a **constructor**. A constructor declares how an object is to be instantiated and initialized from the class blueprint.
- Constructors are declared like methods, but the method signature does not contain a return type
- Constructors always have the same name as the class it is defined in

Just like methods, we can overload constructors with varying number of parameters / types

## Associated Keywords
- this keyword
    - Can be used for constructor chaining when invoked as a method (eg. this(..parameters))
    - To refer to the object itself
        - This is usually done to avoid "variable shadowing" problems
- super keyword
    - references the parent class
    - when invoked similarly to a method (eg. super(..parameters)), the parent class constructor is called
    - could also be used to refer to instance variables defined in the parent class
- "The Default 'no-args' constructor"
    - If we don't define a constructor, the default constructor is provided automatically by the compiler
    - This is known as the default no-arguments constructor
    - NOTE: If we define any constructor in our class, this will NOT be provided

## Types of constructors
1. Default constructor (no-args)
2. User defined no-args constructor
    - If we define any other constructors, the default will not be provided
    - So if we still want to have a no-args constructor, we need to provide our own
3. Parameterized constructor
    - These are constructors that we define with parameters
    - Often used to set properties at the time of instantiation
4. Copy constructor
    - used to take another object and clone its properties into this current object being instantiated
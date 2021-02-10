# Java: Final keyword
The `final` keyword is a type of **non-access** modifier that can be used when declaring an entity. The final keyword essentially means that the value cannot be modified in the future. Final can be used on variables, parameters, methods, and classes

## Final variables
If a variable is declared with the final keyword, once initialized, the value cannot be **reassigned**.
- The variable does not necessarily need to be initialized at the time of declaration
- But once a value is initially assigned, you can never change it after that
- In the case of reference variables, we cannot change what object we are pointing to. But that does not stop us from modifying properties on the object itself.

## Final parameters
If final is used with a method parameter, it's pretty much the same concept as final variables. The value of the parameter cannot be changed inside the method body.

## Final methods
- Cannot be overridden (instance methods)
- Cannot be *hidden* (static methods) by subclasses

## Final classes
Classes declared as final cannot be extended by other classes
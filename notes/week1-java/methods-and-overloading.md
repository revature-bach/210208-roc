# Java: Methods and Parameters
Methods are blocks of code that only run when they are called. The `public static void main(String[] args)` method, however, is a special method that is called directly by the JVM when we run our application. The purpose of utilizing methods, is to reuse code by defining it only once, and then using it many times. We have already seen the usage of methods already throughout our examples.

- Methods must be declared within a class in Java
- Methods are defined with an access modifier, followed by any non-access modifiers, the return type, and then the name of the method and parentheses that can define the various parameters a method may accept
- `<access modifier> <non-access modifier> <return type> <method name>(<parameters...>) { // code here }`

## Method Overloading
It is possible to have methods with duplicate names in Java. This allows us to group methods with similar functionality together and not have to create unique names for each. This is especially useful when you have the need for different types of parameters but similar functionality between the methods. In order to overload methods, we need to
- Have different parameter types

**AND/OR**

- Have a different number of parameters

By following the above guidelines, there is no ambiguity as to which method is going to be invoked through method overloading.

**Method Overloading** is also called **compile-time** polymorphism, because the compiler already knows which method will be called at the point of compilation.

## Method var-args
Var-args stands for "variable arguments", which allows us to set arguments that can be determined at runtime. Under the hood, Java creates an array that contains the arguments provided. There are two important constraints when working with varargs:
- You can only have 1 varargs parameter per method
- It must be the last parameter defined
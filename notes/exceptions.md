# Java: Exceptions
Exceptions are events that occur during execution of programs that disrupt the normal flow of instructions.

**NOTE: Exceptions are not the same concept as compilation errors that might result from bad syntax**

In the context of Java, exceptions are objects that wrap an exceptional event that occurred inside the execution of a method. Exception objects contain information such as the following:
- Information about the exception, including its type
- The state of the program when the exception occurred
- Some sort of exception message that may be specified when the exception is thrown
- Other custom information

Exceptions can be
- Thrown
- Caught

When learning about Exceptions, it is important to understand its hierarchy. This allows us to understand the difference between Exceptions and Errors, for example, and within the context of exceptions, the difference between unchecked exceptions and checked exceptions.

## Exception Hierarchy
![Exception Hierarchy](https://www.javamex.com/tutorials/exceptions/ExceptionHierarchy.png)

## Checked vs Unchecked Exceptions

1. Checked Exceptions
- The `Exception` class and all of its subclasses (except RuntimeException) are known as checked exceptions
- Checked exceptions **MUST** be handled or declared by the programmer, otherwise the code **will not compile**

2. Unchecked Exceptions
- The `RuntimeException` class is a special type of exception that is not required to be handled or declared
- Unchecked exceptions are typically reserved for issues such as
    - `ArithmeticException` for illegal arithmetic, such as dividing by 0
    - `IndexOutOfBoundsException` if we try to reference an index that is larger than the size of our array
    - `NullPointerException` if we try to access a field or invoke an instance method on something that is pointing to no object (`null`)
    - `ClassCastException` if we try to downcast from a parent reference type to some child reference type that is hierarchically valid, but the object is not of that instance.

## Custom Exceptions
Usually we create custom exceptions to have some sort of descriptive element to the type of exceptional event that is happening. Custom exceptions can either extend RuntimeException, which would make it an `unchecked exception`, or extend Exception, which would make it `checked`.

## Handling Exceptions v. Declaring Exceptions
Handling: risky code is placed inside a try/catch block
- try-catch-finally
    - In order to handle exceptions, a try/catch block can be used
    - `try` encloses the code that may throw an exception
        - for example if we call methods/constructors that have some sort of `throws` declaration
    - `catch` defines an exception to catch and run the code inside that block if that exception occurs from the code inside the try block
    - `finally` is used to run a block of code whether an exception is thrown or not. It is always guaranteed to execute unless our program fatally crashes or System.exit() is called.

You can have
- try-finally
- try-catch-catch-...-finally
- try-catch-...

Declaring: We can use the `throws` keyword in the method signature to basically say, `"watch out, if you are a method that calls me, you will need to handle the exception that I might throw under certain conditions"`
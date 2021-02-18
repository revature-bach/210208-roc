# Java Data Types
At a high level, there are two main groups of data types. These are the following:
- Primitive data types
- Reference data types

Primitive data types are fundamental data types in Java that make up the building blocks for other types. Think back to the idea of classes, which act as blueprints. We can have various states for our objects that are composed of primitives and other object references.

Think of chemistry, for example. In our various mixtures we can have a mix of compounds, molecules, atoms, etc., but ultimately at some point, everything reduces down to atoms. Atoms are analogous to the idea primitives.

## Primitives
- Built into the language
- Foundation of all other types
- Four categories of primitives:
    - Integer types (integral types)
    - Floating point types (decimal numbers)
    - Character type
    - Boolean type
- Stored by value

Passed by value and stored by value is important to understand for primitives, because not all langauges treat primitive data types this way.

--- 
**Integral Types**
| Type | Bits | Min Value | Max Value | Literal form |
| :--- | :--- | :--- | :--- | :--- |
| byte | 8 bits | -128 | 127 | 0 |
| short | 16 bits | -32768 | 32767 | 0 |
| int | 32 bits | -2,147,483,648 | 2,147,483,647 | 0 |
| long | 64 bits | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 | 0L |

---
**Floating Point Types**
| Type | Bits | Min Value | Max Value | Literal form |
| :--- | :--- | :--- | :--- | :--- |
| float | 32 bits | 1.4 * 10^-45 | 3.4 * 10^38 | 0.0f |
| double | 64 bits | 4.9 * 10^-324 | 1.7 * 10^308 | 0.0 |

- The important takeaway here is that decimal literals are double by default

---
**Character Type**
- Stores a single unicode character
- Literal values can be placed between single quotes
- For Unicode code points, use \u followed by 4-digit hex value

```java
char myChar = 'U';
char myChar2 = '\u03A9';
```

---
**Boolean Type**
- Stores true/false values
- Literal values are simply **true** and **false**

---
## Reference types
- Reference types are used to refer to objects
- Reference types do not actually contain the object itself, but instead contain a "reference" to the location of the object (memory address)
    - Think of a reference type as a variable holding information on where an object is located.

# Java: Classes v. Objects
- Java has the constructs of **classes** and **objects** built into the language.
    - Objects: represent real-world or conceptual entities
        - Objects have **members**, in which there are two types:
            - Objects contain state (also known as fields or instance variables)
            - Objects contain behavior (also known as instance methods)
    - Classes: are the blueprints for how to create objects
        - This is where methods and fields are defined
        - Objects are created from these class *blueprints*
- Allows us to make use of OOP principles

## Strings
- Strings are not primitives in Java
- Strings are actually objects
    - There is a String class built into Java that serves as a blueprint for all String objects
- Therefore, when we have a variable of the String type, it is actually a reference type variable
    - A reference type variable does not actually contain the object!
    - Instead it contains a reference to the object (an memory address / location where the object is located in memory)

# Casting
In Java, at a high level, we have two forms of casting:
- Explicit casting
- Implicit casting

Casting can be performed on both primitive and reference data types. Although primitive conversion and reference variable casting look similar, they are actually very different conceptually.

In both cases, we "turn" one type into another, but primitive variables actually contain a value, which results in actual changes to its value.

## Primitive Variable Casting
Primitive casting is also known as type conversion. This allows us to change the value from one data type to another. Implicit casting occurs if we go from a primitive type that is "smaller" in range to one that is "larger" in range. In more technical terms, implicit casting occurs when the casting operation is "safe", while explicit casting is necessary if it is "unsafe".

- Widening conversion
    - Occurs implicitly
    - byte -> short -> char -> int -> long -> float -> double
    - Note how long fits inside float, despite long being 64 bits, while float is only 32.
- Narrowing Conversion
    - Occur explicitly
    - Care should be taken when converting from a wider primitive to a narrower primitive
    - double -> float -> long -> int -> char -> short -> byte

## Reference Variable Casting
This is where we convert from one reference type to another. In the case of reference variable casting, implicit casting occurs if we go from a child class up to a parent class, which is "safe". Explicit casting occurs if we go from parent class to a child class, which is "unsafe"

NOTE: As we learn more about inheritance, this will start to make more sense

- Unlike primitive casting, reference casting doesn't modify or touch the object itself, only the variable that is pointing to the object
    - Reference casting simply labels the object in a different way
    - It either expands or narrows the methods/properties available to access/work with
- Implicit casting, goes from child to parent, is also known as **upcasting**, since we're going up to hierarchy
    - This narrows the amount of methods and properties we can access from an object, because we're going from more specific to less specific
- Explicit casting, going from parent to child type, is also knowwn as **downcasting**, since we're going down the hierarchy from parent to child
    - This widens the amount of methods and properties we can access, because we're going from less specific to more specific

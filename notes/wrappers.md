# Wrapper Classes
Wrapper classes allow us to represent primitives as objects. This is important when we begin learning about data structures in the **Java Collection API, which can only store objects and not primitives**.

- Wrapper classes are part of the java.lang package
- Conversion between a wrapper object and a primitive occurs automatically
    - **autoboxing**: primitive to object
    - **unboxing**: object to primitive

## Wrapper utility methods/fields
### Fields
- MAX_VALUE: constant holding the maximum value that that particular wrapper object / primitive can have
- MIN_VALUE: constant holding the minimum value that particular wrapper object / primitive can have
- SIZE: the number of bits
- TYPE: *Class* instance representing primitive type

### Methods (static methods)
- valueOf(..): parses some argument into a wrapper object
- parseInt(..), parseDouble(..), ... : parse some argument into a primitive of that type
- intValue, doubleValue, longValue, etc.: returns value of wrapper object as a primitive

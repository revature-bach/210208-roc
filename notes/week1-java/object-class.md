# Java: Object class
The `Object` class is a special class that is the root class of all other classes. Essentially, other classes either **directly or indirectly** inherit from this `Object` class.

## Methods
The Object class has some important methods we should be taking into account:
- `toString()`: the toString() method inherited from the Object class is automatically called when we print an reference variable. If this method is not overridden (polymorphism), it will print the output as `<fully qualified class name>@hashedMemoryAddress`
- `equals(Object o)`: compares two objects. If .equals(Object o) is not being overridden, then it behaves exactly the same as `==` (aka, it will compare memory addresses). However, we often override .equals(Object o) in order to provide the ability to compare values of objects instead.
- `hashCode()` returns a hash code, which is a number that is used for putting objects into finite numbers of categories. For instance, hashcodes are used in HashMaps, HashSets, and other data structures.

Some rules for hashCode():
- **If we override equals(), hashCode() should also be overridden accordingly to the same properties**
- hashCode() should also have a predictable result

1. If two objects are equal according to .equals(), they MUST have the same hashcode value
2. If two objects are not equal, they do not necessarily have to have different hashcode values.

The Object class also has a `finalize()` method that is called by the garbage collector. We would override this to perform cleanup activities before garbage collecting an object, but we don't need to.
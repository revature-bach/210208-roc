# Java: Collections Frameworks
The Collections framework is a set of classes **and** interfaces in Java that implement commonly used data structures. Below is a diagram showing the Collection hierarchy. The most important interfaces are the following:
- `Iterable`: guarantees that the collection can be iterated over
- `Collection`: the parent interface of all of the collections, EXCEPT Map. Map is separate from this hierarchy
- `List`: is an interface that extends the Collection interface. It represents data structures that are ordered, similar to an Array. Lists can be appended to with more elements, and do not have a fixed size.
- `Set`: a collection that does not contain duplicate elements. If you try to add an element that already exists in the Set, it will simply not add it. The elements are not necessarily ordered, except in the case of TreeSet.
- `Queue`: a collection that operates on a first-in-first-out (FIFO) basis, just like people waiting in a line.
- `Map`: contains key/value pairs and **is separate from the collection hierarchy**. It however, does belong to the collections framework.

![Collections Framework](https://javaconceptoftheday.com/wp-content/uploads/2014/11/CollectionHierarchy.png?x70034)

## Collection v. Collections
- Collection: is the interface that all of the collections except map inherit from
- Collections: is a utility class that contains various static methods that we can use with our collections. (e.g. sort method)
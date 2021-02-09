# One of the Pillars of OOP: Inheritance
Inheritance is the process by which classes, and thus, objects, can **inherit** the state and behavior of other classes. The class that other classes inherit from is known as a **base/parent/super** class, while the class that inherits from another class is called the **child/sub**-class.

## Terminology
- Base/Parent/Super class: the class from which other classes inherit from
- Sub/Child class: the class that inherits from another class
- IS-A relationship: A class that inherits from another class forms an IS-A relationship with the parent class. (ex. A Dog is an Animal)

In Java, all **NON-private** fields and methods are inherited from a parent class. The Dog class, therefore, will have access to all of the public/protected/default field and methods.

The main benefit with inheritance is in re-usability of code. By using inheritance, we don't need to redefine common properties everytime for different classes, instead we can just inherit from another class that provides these properties. 

So this allows us to abide by DRY (don't repeat yourself).
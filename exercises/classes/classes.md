# Writing Custom Classes

## Objectives

* Learn the basics of writing custom Java classes that interact with another.  

## Background

A **class** is a specific construct in Java that can associate behavior and state. It serves as a blueprint for an object (which is a 'living' instance) of the class. You've been writing classes on your own for the most part with little guidance. For instance you've created singular classes in a single project as below.

```java
public class ClassName {

    //main method
    …
}
```

Here we'll show you how to write one class that exhibits state and behavior and how to instantiate it.

## Writing Custom Classes

To start off, begin a new Project in Eclipse and name it Lab12-Classes. Create a new class labeled ClassOne and create a main method in it. Leave the main method empty for now. Your class file should look like below:

```java
public class ClassOne {

    public static void main (String[] args){

    }
}
```

Now, let's add some state. We'll create a simple variable that will specify the object's id. We'll represent that with an `int` labeled `id`. We'll also create a simple method to get and set the `id` variable.

### Getters and Setters

A **getter** and a **setter** is a method that follows a specific convention. They are used to retrieve the value of a variable and set it, respectively.

We'll talk more about getters and setters in following lessons. For now, you should note that they are used to "get" the value of a variable and to "set" it.

Your code should look like the following:

```java
public class ClassOne {

    int id;

    public int getId(){ return id;}

    public void setId(int id) { this.id = id;}

    public static void main (String[] args){

    }
}
```

Now that we have some state and behavior set up, we'll add some more behavior to create an instance of this class and use one of its methods (behavior).

Update the main method to resemble the following:

```java
public class ClassOne {

    int id;

    public int getId(){ return id;}

    public void setId(int id) { this.id = id;}

    public static void main (String[] args){
        ClassOne c1 = new ClassOne();
        c1.setId(25);
    
        System.out.println(c1.getId());
    }
}
```

So, we've done a few things here. Within `main()`, we used the new keyword to create an instance of ClassOne. Note that just like a primitive, we specify the type (in this case it is the class type of ClassOne) and we specified a variable name, c1. On the right-hand side of the assignment, we used the new keyword and then called ClassOne();. This looks like a method call, but later on, you'll find out that this is a special method called a **constructor**.

We then called the `setId` method and passed in the value of 25. You'll learn more about writing and using methods in our video on Methods.

Lastly, we called the `println` method and passed it the `getId()` method which returns an `int` (the current value of id) and that prints it to the console.

Run the code, you'll see that the value of 25 prints to the console.

Although, this example seems very complex, it's actually quite simple. We'll demonstrate each of the components of this class in following lessons and you'll understand how to manipulate each according to your program's needs.

This concludes the lab.
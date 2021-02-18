# Java: Variable Scopes
Like pretty much all other programming languages, Java has the concept of scope. We have essentially 4 different types of scope to be aware of.

These are the scopes ordered from highest level to lowest level
1. Static Scope
    - Static scope refers to a variable that belongs to the class itself
    - Any other scope below static can access variables in the static scope
2. Instance Scope
    - Instance scope refers to a variable that belongs to a particular instance/object
    - Instance methods can access static variables as well as instance variables.
    - We can also invoke static methods from within instance methods
3. Method Scope
    - Variables declared within a method
    - Whenever a method is done executing, the variable is no longer in scope and is basically gone
4. Block Scope
    - Refers to variables defined within a block of code, such as
        - if statements
        - for loops
        - while loops
        - etc.
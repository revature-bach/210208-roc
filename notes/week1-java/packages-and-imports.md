# Packages and Imports
Packages are used to group related classes. We can essentially think of packages like folders. Packages are used to group similar code as well as to prevent naming conflicts in order to promote maintainability in our projects. We have:
- Built in packages from the Java runtime libraries (JRE)
- User-defined packages (the packages we create ourselves)

Imports allow us to use classes from other packages. The **import** keyword tells the JVM what class to use from where. We also have **import static** (static imports), which allow us to import static methods or static variables to use directly without needing to refer to them by `Classname.<whatever>`

The **package** keyword followed by the package name should be the first line in the .java file, followed by any imports from other classes
# Maven
Maven is a dependency manager and build automation tool for Java programs. Maven project configuration and dependencies are handled using the Project Object Model, which is defined in a file called the `pom.xml` file. This file contains information about the project, including project dependencies and various Maven plugins.

- `<properties>`: where we will put various project-specific settings
- `<dependencies>`: where we will put Java dependencies that we want to use

## What is a Dependency?
We can think of dependencies as some sort of library that we are going to use in our program. So our program itself is "dependent" on this to actually work. So in our case, one of the dependencies we are going to use will be the `Postgres Driver` dependency.
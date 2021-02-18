# SQL
SQL stands for **structured query language**, which is a domain-specific language for working with a particular category of databases known as relational databases.

SQL is a **declarative language**. This basically means that we declare what we want and then let the engine under the hood take care of what needs to be done. Most of the heavy lifting in order to retrieve or manipulate data is abstracted away from the user. This is opposed to **imperative languages** such as Java, Python, or C. Imperative languages are languages that require giving instructions to the finest level of detail in which we need to specifically define what we want to accomplish.

SQL is a NOT a programming language, but rather is a "query" language (declarative). This language allows us to perform operations on a relational database.

SQL has English-like syntax that allows people who need to access data from a relational database ease of use. Instead of focusing on the HOW, we instead can focus on the WHAT.

## Relational Database
SQL is used with a type of database known as a relational database. There are other types of databases such as NoSQL, but in our case we're just dealing with relational DBs like PostgreSQL. When you think SQL, think relational.

Relational refers to databases that store information in tables in the form of rows and columns. This is very similar to how data is stored in Excel spreadsheets that we work with. Each row is a particular record, while the columns correspond to different properties in our table.

ex. We can have a table called `people`, and each row would correspond to a person. Columns would correspond to the properties of each person.

## Relational Database Management System (RDBMS)
To provide for a way to utilize the concept of relational databases, we have RDBMSes, or **relational database management systems**.
- Refers to the database program itself
- This is the software that takes our queries and actually makes them happen
    - retrieving
    - updating
    - inserting
    - deleting
- Many different flavors of RDBMSes exist
    - PostgreSQL ("Postgres")
    - Oracle
    - MySQL
    - MS SQL Server

# SQL Datatypes
Similar to how we have various datatypes in Java, we also have datatypes within SQL.

## Numeric Types
| Name | Storage Size | Description | Range |
| :--- | :----------- | :---------- | :---- |
| smallint | 2 bytes | small-range integers | -32768 to 32767 |
| integer | 4 bytes | typical choice for integer-based numbers | -2147483648 to 2147483647 |
| bigint | 8 bytes | large-range integer | ... |
| decimal | variable | user-specified precision | up to 131072 digits before the decimal point, up to 16383 after |
| numeric | variable | user-specified precision | up to 131072 digits before the decimal point, up to 16383 after |

## Monetary Types
| money | 8 bytes | currency amount | -92233720368547758.08 to 92233720368547758.07 |

## Character Types
| Name | Description |
| :--- | :---------- |
| varchar(n) | variable-length with limit |
| character(n), char(n) | fixed-length, blank padded |
| text | variable unlimited length |

We have other types such as
- Date/time types
- Binary data types (to store files and images, for example)
- Boolean type
- etc.

# SQL Sublanguages
SQL statements are separated into different sub-languages. In SQL, we have 5 different sublanguages to be aware of.
- DDL - Data Definition Language
- DML - Data Manipulation Language
- DQL - Data Query Language
- DCL - Data Control Language
- TCL - Transaction Control Language

## Data Definition Language (DDL)
DDL is a sublanguage used to define the database schema. Schema refers to the structure or skeleton of the database. Keywords in SQL that belong to DDL include:
- CREATE, which is used to create new tables (or other objects)
- ALTER, which is used to modify existing tables (or objects)
- DROP, which is used to delete tables (or objects)
- TRUNCATE, which is used to delete data inside a table, but not the table itself

DDL statements cannot be rolled back, so whenever you execute these statements, the change is permanent.

## Data Manipulation Language (DML)
DML is a sublanguage used to perform operations known commonly as CRUD (create, read, update, delete) operations. Keywords belonging to DML include
- INSERT, which is used to insert a new record into a table
- SELECT, which is used to obtain one or more rows in a table. This is what is used to query data
- UPDATE, which is used to modify one or more records in a table based on a WHERE clause
- DELETE, which is used to delete one or more records in a table based on a WHERE clause

## Data Control Language (DCL)
DCL is a sublanguage used to regulate access to data by imposing restrictions such as user permissions. This pertains to security of the database.
- GRANT: allows you to define access privileges
- REVOKE: remove access privileges

## Transaction Control Language (TCL)
Transaction control language is a sublanguage that pertains to the work being done on a database. This work will be in particular DML operations that are modifying data in our tables. For each group of DML operations occurring, we have the concept of transactions that can be either finalized or reverted.
- COMMIT: persists the changes of the transaction
- ROLLBACK: rollback the transaction to before the transaction was started (you cannot rollback a commit)
- SAVEPOINT: create a checkpoint that can be rolled back to
- SET TRANSACTION: used to set isolation levels

By default, the database is set to automatically commit each DML statement. So if you don't want that to happen, you could turn off autocommit.

## Data Query Language (DQL)
Sometimes the **SELECT** statement is included in DQL separately from DML. This is really a point of contention between different people who use SQL. Some want SELECT to be separate from DML. There are many different clauses associated with DQL that we should be aware of.

### SELECT
SELECT allows us to select data based on various columns. In order to SELECT data from tables, this is followed by the FROM clause, where we would actually specify a table name.

```sql
SELECT column1, column2, ...
FROM table_name;
```

We can also display data from all columns using the (*) wildcard

```sql
SELECT *
FROM table_name;
```

The `WHERE` clause allows us to select records that match a certain condition

```sql
SELECT *
FROM table_name
WHERE id = 10;
```

### GROUP BY
The group by clause can be added after SELECT ... FROM ... WHERE ... in order to combine all rows by some column specified in the query and any aggregate functions performed that were stated.

```sql
SELECT name, COUNT(name)
FROM student
GROUP BY name
```

We can also have a `HAVING` clause that follows by `GROUP BY` clause in order to filter out the results after grouping.

```sql
SELECT name, COUNT(name)
FROM student
WHERE name LIKE 'j%'
GROUP BY name
HAVING COUNT(name) > 1
```

**Understand the difference between `HAVING` and `WHERE`**

# Aggregate and Scalar Functions
## Scalar Functions

Scalar functions act on individual values, PER ROW. Scalar functions can be used with the `SELECT` or `WHERE` clause
- UPPER(<value>)
- LOWER(<value>)
- LENGTH(<value>)
- ROUND(<value>)
- ABS(<value>)
- Many others

## Aggregate Functions
Aggregate functions operate on multiple values (across multiple rows). These functions can be used to combine, or aggregate, the values existing in a column.
- MAX(<column>)
- MIN(<column>)
- AVG(<column>)
- SUM(<column>)
- COUNT(<column>)
- others..

Aggregate functions are used in the SELECT clause, and cannot be used in the WHERE clause.

If we are selecting more than one column in the SELECT clause, a GROUP BY clause is required.

If we want to do some filtering similar to WHERE with aggregate functions, the HAVING clause would be required.

# Schema
A database schema refers to the structure of data defined in a relational database. This includes the tables and their columns + datatypes along with the relationship between different tables. These schemas are enforced using constraints that are defined when creating tables. We can visualize the schema of a relational database when we utilize entity-relationship diagrams, or ERDs.

# Constraints
In SQL, we have the idea of constraints that we can define for specific columns when defining a table. This allows us to ensure consistency and integrity of data in a table. Some of the constraints are the following:
- PRIMARY KEY
- FOREIGN KEY
- NOT NULL
- UNIQUE
- CHECK
- DEFAULT

## Primary Key
A primary key is a constraint that uniquely identifies a record in a table (row). Usually this constraint will be added to some sort of ID field/column, such as "employee_id". A primary key is inherently consisting of two other constraints, which are NOT NULL and UNIQUE. In other words, a primary key must be provided when inserting a record into a table, unless we have some sort of automatic generation for that primary key behind the scenes.

## Foreign Key
A foreign key is a constraint that signifies that a column is being used to refer to a primary key on a different table. This is what allows us to establish relationships between different tables. For example, if we have 2 tables, user and post, to model the relationship between users and their posts, we may have a posts table with the foreign key `user_id` that would reference the `id` PRIMARY KEY field in the user table. We would then know which user made what post if we look up the id found in the owner table.

## Not Null
This constraint requires that all records (or rows) have a value for that particular field. If we require data in this column to be present for every record, we would use not null.

## Unique
This ensures that we do not have duplicate values for that particular column.

## Check
Check provides the ability to perform validation on records being inserted or modified

## Default
This allows for default values to be applied if we do not insert explicitly some data for that particular column when we are inserting a record.

## Composite Keys
Most of the time, the primary key will consist of a single column. Sometimes, however, multiple columns may be used together to create a primary key to uniquely identify a row. Each column that makes up this composite key is known as a **candidate key**. This forms a primary key with multiple columns known as a **composite key**. In the example of a CD collection, we may have a table called `track` that has the columns `track_no`, `album_id`, `genre`, etc. Notice that `track_no` by itself would not work as a primary key because we may have multiple albums with the same track numbers. Therefore, in this case, we would have a composite key made up of album_id and track_no in order to uniquely identify a song.

# Referential Integrity
When we create relationships between tables as we have demonstrated with the link between the primary key in the `users` table and the foreign key in the `posts` table, we want to make sure that integrity is upheld between the two tables. For example, we should not have a situation in which a record is pointing to another record that does not exist in the database. If referential integrity is not upheld, we would have a situation in which the database contains **orphan records** - records whose foreign keys are not pointing to an existing record in another table. 

# Multiplicity
Table relationships, as mentioned before, can be established through the use of foreign key constraints within our tables. There are different types of relationships we can have between tables in relational databases:
- One to One: A classroom has one projector (unique constraint on the foreign key)
- One to Many / Many to One: A student has many books (Many books have one student)
- Many to Many: A teacher can have many students, but a student can also have many teachers

In the case of a one-to-one relationship, the foreign key coudl be on either side of the relationship. We may have a classroom_id foreign key on the projector table, or we could have a project_id foreign key on the classroom table, for instance. Whatever side the foreign key is on should also be having the UNIQUE constraint.

A one-to-many relationship requires that the foreign key be on the **many** side of the relationship. The book table would have a foreign key student_id signifying that the book belongs to a particular student.

Many-to-many relationships require that a junction table be created. This allows for the two tables to be related to each other. WE could create a table such as `class`, which contains two foreign keys, one pointing to teacher and the other to student.

# Database Normalization
Database normalization is a design pattern for databases that aims to reduce redundancy and duplicate data. It also aims to help keep a database organized and maintainable.

Referential integrity should always be upheld.

Levels of normalization:
- 0NF = Zero Normal Form
    - No normalization at all
    - Complete chaos
- 1NF = 1st Normal Form
    - Data should be atomic (e.g. a name field with both First and Last name 'John Doe' should be broken into two columns (firstname, lastname), ('John', 'Doe'))
    - Table must have a primary key
- 2NF = 1st NF + No partial dependencies
    - Cannot have columns that are dependent on only one part of the composite key
    - You are automatically in 2NF if you have no composite key, and already satisfy other requirements of 1NF
- 3NF = 2nd NF + no transitive dependencies
    - If you have a column, C, dependent on another column, B, which is then dependent on column A (PK), we are not in 3NF because C is only indirectly related to the primary key
    - Your columns should describe the primary key and the primary key only

A way to remember this would be that we must have **a key (1NF)**, the **whole key (2NF)**, and **nothing but the key (3NF)**.

# Transaction Properties: ACID
Whenever we perform modifications to the data in our database, we are utilizing the SQL sub-language DML (data manipulation language). Whatever operations occur before a COMMIT statement is considered a single transaction, or unit of work (as long as we begin a transaction and we are not autocommitting). An example of a transaction may be the transferring of money from bank account A to bank account B. These are two different operations that we want to group together as a single modification (transaction). Transactions have 4 different properties summarized as the ACID properties:

- **Atomicity**: means that transactions will execute successfully or not at all. We are treating all the operations that are part of the transaction as a single unit that either completely succeeds or does not at all.
- **Consistency**: constraints are enforced for every committed transaction. This means is that the primary and foreign keys, data types, checks, NOT NULL, UNIQUE, etc. will be upheld. If any violation occurs, the modification is not allowed.
- **Isolation**: If we have two transactions occurring at the same time (concurrency) and they are working on the same data, we shoudl not have one transaction disturbing the other. Isolation essentially gives us some guarantee that concurrently running transactions do not affect one another.
- **Durability**: When a transaction is complete (has been committed), the changes should be persisted to the database. Even if our system were to lose power or be shut off, the changes will still be there in permanent memory.

# Isolation Levels
This is related to the I in the ACID properties. It refers to the degree in which two transactions will interfere with each other when modifying the same data.
- When applications become more complex and more traffic and modifications are made to the database concurrently, we need to account for interference issues.
- The more strict our isolation level, the more careful the system is about avoiding conflicts, but this could cause performance issues since concurrency would decrease with a more strict level

| Isolation Level | Dirty Read | Non-repeatable Read | Phantom Read |
| :------ | :------ | :------- | :---------- | 
| Read Uncommitted | Y | Y | Y |
| Read Committed | N | Y | Y |
| Repeatable Read | N | N | Y |
| Serializable | N | N | N |

# Database Joins
- Joins are operations that allow us to "join" data together from different tables
- Useful when retrieving data based on the relationships between tables
- Several types
    - INNER JOIN
        - Only show records that have the condition matching on both sides
    - FULL OUTER JOIN
        - Show matching records and records that have no match, with NULL values on the opposite side for nonmatching cases
    - LEFT/RIGHT JOIN
        - Data from the LEFT (or RIGHT) table are paired with the other table, with NULLs if no match is found for the other side
    - CROSS JOIN
        - Cross product of both tables
        - List of permutations
            - A lot of data!
            - ex. Table w/ 1000 records, another with 2000
                - Results would be 2,000,000 rows (1000 * 2000)
    - SELF JOIN
        - It's not really a "type of join", but it describes utilizing joins on the same table
        - employee table has a foreign key, manager_id pointing to primary key, id, on the same table

```sql
SELECT <columns> FROM <left table> <JOIN TYPE> JOIN <right table> 
ON <left table>.column = <right table>.column
```
- equals (=) means equijoin
- we could technically not use the equals operator (=) and that would be a theta join

# Set Operations
Set operations are performed using set operators, which are different than joins. Instead of joining tables by joining their columns, set operators take rows and combine more rows.

Some operators include:
- UNION [ALL]
    - UNION doesn't keep duplicates unlike UNION ALL
- INTERSECT
    - returns records common between queries
- EXCEPT
    - removes from our first result set what rows appear in the second result set
        - gives us to first set MINUS the second set

# SQL Study Guide
You should be able to explain and apply all the following topics:

# Basics
- Schema
    - The structure of your database
        - contains tables, functions, indices, etc.
    - Can create different schema within a database
- SQL language and sublanguages
    - DDL (Data definition language)
        - ALTER: alter the structure of an object (like tables)
            - add columns
            - add constraints
            - remove columns/constraints
            - etc.
        - TRUNCATE
            - removes data from a table, but does not delete the table itself
        - CREATE
            - used to create a new table and define a structure for that table (columns and their datatypes, constraints)
        - DROP
            - delete a table
    - DML (Data manipulation language)
        - CRUD operations:
            - INSERT: insert rows into a table
            - SELECT: query data
                - FROM
                - JOIN... ON ...
                - WHERE
                - GROUP BY
                - HAVING
                - ORDER BY
            - UPDATE: used to update the data inside existing rows (usually used with WHERE, otherwise you update the values for every row in a particular column)
            - DELETE: deletes rows from a table, usually used with WHERE (otherwise you delete everything)
    - DQL (Data query language)
        - SELECT
            - SELECT also exists in DML
            - Some people consider it to be a separate sublanguage
    - DCL (Data control language)
        - GRANT
        - REVOKE
    - TCL (Transaction control language)
        - COMMIT
        - ROLLBACK
        - SAVEPOINT
        - BEGIN TRANSACTION
- RDBMS systems and popular vendors
    - PostgreSQL
    - Oracle
    - MySQL
    - MS SQL
    - Different dialects and different systems
- SQL data types
    - VARCHAR(n)
    - INTEGER
    - SERIAL (postgres)
    - NUMERIC
    - BOOLEAN
    - BYTEA (for storing files, etc)
    - etc.
- Constraints
    - NOT NULL
    - PRIMARY KEY
    - FOREIGN KEY
    - UNIQUE
    - DEFAULT
    - CHECK
- Composite Keys
    - Primary key made up of two or more columns
    - Each columns is called a **candidate key**

# Normalization
- 1NF
    - Atomic data (not to be confused with atomicity from the ACID transaction properties)
    - Must have a primary key
- 2NF
    - 1NF + no partial dependencies
        - Your columns must describe the entire key, and not a single candidate key
    - If you don't have a composite key, you're already in 2NF
- 3NF
    - No transitive dependencies
    - Your columns should describe the key and only the key

- You must have the key (1NF), describe the whole key (2NF), and describe nothing but the key (3NF)

# Relationships
- Known as multiplicity or cardinality relationships
    - One-to-one
        - The foreign key is on either table
        - The foreign key also has the unique constraint (to prevent duplicate foreign keys, which would make this one-to-many instead)
    - One-to-many
        - the foreign key is on the many table
    - Many-to-many
        - Requires a junction table (or join table, as some call it)
            - Has the foreign keys referring to each table

# Queries
- Query clauses
    - SELECT
    - FROM
    - JOIN... ON ...
    - WHERE
    - GROUP BY
    - HAVING
    - ORDER BY
- Aliases
    - We can aliases for things like
        - columns
        - tables
        - subqueries
- Joins
    - INNER
    - OUTER
    - LEFT/RIGHT
    - CROSS: permutations
    - Conceptual types
        - SELF: (ex. employee table, with FK manager_id pointing to another entry in the employee table itself)
        - Equi-join: a join where the condition is based on equality (ex. post.user_id = user.id)
        - Theta-join: a join where the condition is not based on equality (ex. post.user_id > user.id)
- Set Operations
    - UNION (discards duplicate rows)
    - UNION ALL (keeps duplicate rows)
    - INTERSECT (keeps rows that are common between the two sets)
    - EXCEPT (subtracts rows contained in a set from another set) 

# Aggregate Functions
- Generally use in combination with GROUP BY
- Act upon multiple rows.. condenses results into an aggregate value
- MIN
- MAX
- AVG
- COUNT
- SUM
- etc...

# Scalar Functions
- Acts individually on each row, and returns a result for each row independently
- LENGTH
- UPPER
- LOWER
- ABS
- TRIM

# Transactions
- Properties of a transaction (ACID)
    - Atomicity
    - Consistency
    - Isolation
    - Durability
- Isolation levels (in order of least strict to most strict)
    - Read uncommitted
    - Read committed: prevents dirty reads
    - Repeatable read: prevents dirty reads + non-repeatable reads
    - Serializable: prevents dirty reads + non-repeatable reads + phantom reads
- Read phenomena
    - Dirty read
    - Non-repeatable read
    - Phantom read

# JDBC
- JDBC classes / interfaces
    - DriverManager (class)
    - Connection (interface)
    - DataSource (interface)
    - SQLException (class)
    - Statement (interface)
    - PreparedStatement (interface)
    - CallableStatement (interface)
    - ResultSet (interface)
- Creating database connection
    - We made a utility class
        - getConnection method to return a Connection object
            - We then do all the logic in the getConnection() method
            - Get credentials
                - Environment variables
                - Properties file
                - Hardcoding (not advised)
- Connection Parameters
    - Connection String (URL)
        - `jdbc:postgresql://<host name>:<port>/<database name>`
    - username
    - password
- JDBC autocommit mode
    - autocommit on by default
    - we can turn it off by using a Connection object
        - `con.setAutocommit(false)`
- Data access object (DAO) design pattern

# 3 Layer Architecture
- Presentation layer
    - Represents the layer that the user interacts with
    - This could be a menu system like in our console application
    - More realistically it might be a layer representing REST API endpoints
- Service layer
    - This contains the business logic of the application
    - This is the intermediary between the presentation layer and the DAO layer
- DAO layer
    - Contains logic related to executing SQL queries, updates, etc.
# Java : Operators
Operators in Java allow us to perform operations with our primitives. In Java, we have 5 different categories of operators.
- Arithmetic operators
- Logical operators
- Assignment operators
- Relational operators (comparison operators)
- Bitwise operators

## Arithmetic Operators
Arithmetic Operators allow us to perform common mathematical operations.

| Operator | Name | Description | Example |
| :--- | :--- | :--- | :--- |
| + | Addition | Adds together two values | x + y |
| - | Subtraction | Subtract one value from another | x - y |
| * | Multiplication | Multiplies two values | x * y |
| / | Division | Divides a value by another | x / y |
| % | Modulus | Returns the division remainder | x % y | 
| ++ | Increment | Increases the value of a variable by 1 | ++x or x++ |
| -- | Decrement | Decreases the value of a variable by 1 | --x or x-- |

Operator Precedence (from highest to lowest)
- Postfix (x++ or x--)
- Prefix (++x or --x) 
- Multiplicative (* / %)
- Additive ( + - )

## Logical Operators
While arithmetic operators are used to perform operations on numeric primitives, logical operators are used to perform operations with booleans.

| Operator | Name | Description | Example |
| :--- | :--- | :--- | :--- |
| && | Logical AND | Returns true if both statements are true | x && y |
| \|\| | Logical OR | Returns true if one of the statements is true | x \|\| y |
| ! | Logical NOT | Returns false if the result is true and vice versa | !x |

## Assignment Operators
Assignment operators allow us to assign values to a particular variable.

| Operator | Example | Same As |
| :------- | :------ | :------ |
| = | x = 3 | x = 3 |
| += | x += 3 | x = x + 3 |
| -= | x -= 3 | x = x - 3 |
| *= | x *= 3 | x = x * 3 |
| /= | x /= 3 | x = x / 3 |
| %= | x %= 3 | x = x % 3 |

## Relational Operators
Relational / comparison operators allow us to compare values against each other. These will evaluate to booleans.

| Operator | Name | Example |
| :------- | :--- | :------ |
| == | Equal to | x == y |
| != | Not equal | x != y |
| > | Greater than | x > y |
| < | Less than | x < y |
| >= | Greater than or equal to | x >= y |
| <= | Less than or equal to | x <= y |
| instanceof | Instance comparator | Returns true if reference variable is pointing to an object of that type | x instanceof String |
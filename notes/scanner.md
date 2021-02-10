# Java: Reading from the console w/ Scanner
Scanner is a class found in the java.util package that is used to read input data from different sources. (eg. console input, files, etc.)

Scanner takes an InputStream object in its constructor, so when we are instantiating this object, we will pass in a special InputStream corresponding to our console input.

## Methods
- nextLine(): returns a string containing the text entered on the line of input
- next(): read the next token/word in the input
- Primitive reads:
    - nextByte()
    - nextShort()
    - nextInt()
    - nextLong()
    - nextFloat()
    - nextDouble()
    - nextBoolean()
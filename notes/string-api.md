# Java: String API
Strings in Java are not primitives unlike some other programming languages. They are instead **immutable** objects that are instantiated from the `String` class.

Immutable: means that states or values of the object cannot be altered once created.
- Accomplished using
    - private and final fields
    - not implementing "setter" methods
- Implications of immutability for Strings: all methods in the String class that return a String return a brand **new String** every time.
    - We cannot change a String object's actual value, so a new String must be generated with the desired modifications

## String API methods
- `concat(String str)`: concatenate strings together
    - returns a completely new string
    - some string + another string
- `startsWith`
    - `startsWith(String prefix)`
    - `startsWith(String prefix, int offset)`
- `endsWith(String suffix)`
- `contains(CharSequence s)`: returns true if a String contains that particular sequence of characters
- `charAt(int index)`: return a char at a given position in the string
- `matches(String regex)`: returns true if the string matches a given **regular expression**
- `substring(int beginIndex)`: returns a portion of the string as another string starting at some index (indices start at 0)
- `substring(int beginIndex, int endIndex)`: returns a portion of the string starting a given index to the last index (NOT INCLUDING the end index)
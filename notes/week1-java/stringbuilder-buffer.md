# Java: StringBuilder and StringBuffer
Since Strings are immutable like mentioned previously, it would be really inefficient to use Strings if we have to constantly generate new Strings. Imagine a situation in which we are generating a new String through an iterative process in a for or while loop, tacking on additional characters each time. This would create a new String object each and every time we do that concatenation

Instead of wasting the computing resources needed to allocate brand new memory when we instantiate a new String object on each iteration, we can instead make use of StringBuilder and StringBuffer. These provide a way to construct strings in a mutable process. They both contain methods such as `append()` and `insert()`, which mutate the internal sequence of characters.

The difference between StringBuilder and StringBuffer is that StringBuffer is thread-safe and therefore useful for multi-threaded applications where multiple threads may be using the StringBuffer object. The tradeoff with being thread-safe is that StringBuffer is slower than StringBuilder. 

Since we are not doing multi-threading, we can simply use StringBuilder instead, because it is faster.

| Class | Immutable? | Thread-safe? | Speed |
| :---- | :--------- | :----------- | :---- |
| String | Y | Y | Slowest |
| StringBuilder | N | N | Fastest |
| StringBuffer | N | Y | Fast |
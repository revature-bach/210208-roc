# Concurrency
"The art of doing several things at the same time". Up to this point, our project, our demos, everything has been 1 thing at a time. In other words, everything so far has been single threaded.

A **thread** is a single flow of execution. You can think of a thread like a single person reading a book, line by line. If we are talking about multi-threading, you can think of it similar to many people reading a book. It would appear that different threads are all doing different instructions at the "same time".

# Multi-threading vs Parallel Processing
On a single core CPU, we are only executing a single task at a time, even if we are making use of multi-threading. What is actually happening is that the CPU rapidly switches between different threads, and each thread essentially competes against another for CPU time.

In the case of a multi-core CPU, many tasks can really occur at the same time, on different cores. Each core is basically a processing unit that can execute instructions. These cores still rapidly switch between different threads, especially if we have more threads than we do cores. But the important thing here, is that we are actually processing things in paralell, **FOR REAL**.

# What Handles the CPU sharing between threads?
A thread scheduler that is responsible for giving each thread time to have instructions executed. The scheduler will choose to pause execution of a certain thread to give time to another thread. There are three reasons why this pausing may happen.
1. CPU should be shared equally among threads
2. Thread might be waiting for some more data
3. Thread is waiting on another thread to do something

# Race Condition
We have seen previously, that I have mentioned about the concept of thread safety. Particularly, it was mentioned in regards to the difference between **StringBuilder** and **StringBuffer**. StringBuilder is not thread-safe, while StringBuffer is thread-safe. So what does this mean?

Accessing data concurrently (reading/writing) can lead to issues. This is the idea of thread-safety (or lack of). We can run into an issue known as a **race condition**, which is where two threads are basically trying to read and write from the same variable at the "same time". 

## How to Solve Race Conditions?
We can solve the problem of **race conditions** by utilizing **synchronization**.

Synchronization means to prevent threads from accessing something at the same time, such as a method, or block of code. Behind the scenes, Java utilizes a special object known as a **lock object** in order to perform synchronization. 

When a thread wants to access something, it needs to get the key for this lock object. The key is available as long as no other thread has it. Once a thread receives the key, it is able to access the method or block of code. If another thread wants access to the same method/block of code, it will need to wait for another thread to finish and return the key before this other thread can take the key and use it.

## Lock Object
In Java, every object can play the role of being a **lock**. 

In the example below, we place the synchronized keyword directly on the method itself. In this case, the Singleton class itself will behave as the lock object.

```java
public class Singleton {
    // .. some code

    public static synchronized Singleton getInstance() {
        // some code in here
    }

    public static synchronized void anotherMethod() {

    }
    // Both of these methods are using the same lock object, which is the class Class object for the Singleton class
    // If a thread is inside one of these synchronized methods, then no other thread can use a synchronized method inside the class

}
```

On the other hand,
**A synchronized non-static method will use the instance itself as a synchronization object**
```java
public synchronized String getName() {
    return this.name;
}

public synchronized int getAge() {
    return this.age;
}
```

**We can also use a dedicated object to act as our synchronization key**
```java
public class Person {
    private Object key = new Object();
    private Object key2 = new Object();

    public String getName() {
        synchronized (key) {
            return this.name;
        }
    }

    public int getAge() {
        synchronized (key2) {
            return this.age;
        }
    }
}
```

# Deadlock
A deadlock is a situtation where some thread is waiting for another thread to finish and give up its key so that the thread waiting can use it, but then the other thread is also waiting on this thread to do that same thing. So both of them never give up their keys, and we end up in a deadlock situation.

# Livelock
This is basically the opposite of deadlock, where two threads are too eager to give up access to some method/block of code, and they keep deferring to the other thread, so neither gets anything done.

# Producer/Consumer Pattern
- Producer and Consumer are running on different threads
    - They are both accessing some sort of "buffer" that will contain values
- The producer produces values to place into this buffer
- The consumer consumes values from this buffer

Some considerations for this:
1. The buffer could become empty or full
    - If the buffer is empty, then the consumer thread should wait for the producer to produce some values
    - If the buffer is full, then the producer should wait for the consumer to consume some values
    - As soon as a buffer that is empty has values produced for it, then the producer should notify the consumer to wake up
    - As soon as a buffer that is full has values consumed for it, then the consumer should notify the producer to wake up
2. Our consumer and producer are accessing the same buffer, so access to this buffer should be synchronized

This can be accomplished with the **wait()** and **notify()** methods.

## wait()
- Invoking wait() will release the key from the thread currently holding it, and the thread will basically go to sleep (it is entering the WAITING state)

## notify()
- Invoking notify() will notify a thread this is currently in the WAITING state to then enter the RUNNABLE state
- notify() will choose a single thread randomly to notify
- we can use `notifyAll()` to put every WAITING thread into the RUNNABLE state

# Thread States
- NEW: thread is first created, not doing anything yet
- RUNNABLE: this thread is now able to be given execution time by the thread scheduler
    - While in the runnable state, the thread can transition to the following states:
        - BLOCKED: a thread is waiting to enter a synchronized method or block of code that is currently being occupied by another thread
        - WAITING: thread is parked because of the wait() call, and must have another thread notify this thread to return back to the RUNNABLE state
        - TIMED_WAITING: thread is parked because of sleep(timeout) or wait(timeout)
- TERMINATED: thread is done and can be terminated

`t.getState()` will return an ENUM representing the above states.
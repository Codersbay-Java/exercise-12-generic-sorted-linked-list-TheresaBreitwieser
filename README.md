# Generic Sorted Linked List
## Deadline: 16.05.2022 8:00
## Implementation
Your task is to implement a sorted linked list. The elements must
be inserted at the correct position. Inserting at the last position
and sorting afterwards **is not** allowed.

A basic skeleton is already provided. The generic interface
`SortedList` is the base of your implementation. Therefore, 
`SortedLinkedList` must implement it. Do not use raw types.
`SortedLinkedList` should also implement a good-looking `toString()`
method.

An output example could be:
~~~
| a | ->| b | ->| g | ->| x | ->| z | 
~~~

The goal is to have a list which can work with all comparable
objects.

## Testing
Test your implementation intensively. Try out corner cases. 
Test all your methods = 100% code coverage.
Your implementation must care of error handling. Moreover, test
it with at least three different classes.
* One of them should be String.
* Two self written classes which are comparable. Small classes are
totally fine.
  
## Questions
* How can you change the ordering of the list? From ascending 
to descending. Name at least two different methods.


--> Invert return type(-) of .compareTo method or implement 
a new method to make a copy of the list and copy in values from asc to desc.


* Can the inner Node class be static? Justify your answer.

--> Yes but if you want to create a new Node, you first need to create
an instance of outer class. An outer class can not be static.


* Can you name the generic placeholder `Placeholder` instead of
`T`? If yes should you, do it?

--> In theory yes, but it is not "common practice" and should not be done. 

* Which benefits does this data structure have?
--> A Sorted linked list is a dynamic data structure and does not have
a fixed size like an array. In addition, the use of generics enables 
us to use this data structure with different data types.

* Which drawbacks does it have? Name a use case.
--> More memory is required in case of linked list compared to an array.
In addition accessing a node in a linkedlist is more time consuming because
you need to traverse the list from head on. An Array is index based, which means faster.

* Will the following class compile? If not, why?

~~~java
public final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}

~~~
-->The code will not compile because the "greater than >" operator is only applicable for primitive number data types (like int, float, double which belong to superclass Numbers..).

* If the compiler erases all type parameters at compile time, why should you use generics?
-->Elimination of Casts
-->Stronger type checks at compile time. 
Otherwise you would always have to include instanceOf checks and casts and risk runtime errors which you would always like to avoid.



* Consider this class:

~~~java
class Node<T> implements Comparable<T> {
    public int compareTo(T obj) { /* ... */ }
    // ...
}
~~~

Will the following code compile? If not, why?

~~~java
Node<String> node = new Node<>();
Comparable<String> comp = node;
~~~

-->Yes, compilation is possible

* Write a generic method to exchange the positions of two different elements in an array
~~~java
public class switchElementPosition {
    public static <T> void switchPosition(T[] array, int x, int y) {
        T temporary = a[x];
        a[x] = a[y];
        a[y] = temporary;
    }
}

~~~
---
> **NOTES:**
Write readable and good code. Do not repeate yourself use final,
static and access modifiers accordingly. Do not forget equals methods
for your own classes.

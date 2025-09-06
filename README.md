# Java Collections Overview

This repository contains basic implementations and notes about some core data structures in Java.

## ArrayList
- A **resizable array implementation** of the `List` interface.  
- Provides fast **random access** (O(1) for get/set).  
- Slower for **insertions and deletions** in the middle (O(n)).

## LinkedList
- A **doubly linked list implementation** of the `List` and `Deque` interfaces.  
- Efficient for **insertions and deletions** (O(1) when position is known).  
- Slower for **random access** compared to `ArrayList` (O(n)).

## Stack
- A **last-in-first-out (LIFO)** data structure.  
- In Java, implemented as a class that extends `Vector`.  
- Supports basic operations like **push, pop, and peek**.

## HashSet
- A collection that **stores unique elements**.  
- Backed by a **hash table**.  
- Offers constant-time performance for **add, remove, and contains** (O(1) average).  
- Does **not maintain insertion order**.

## TreeSet
- A collection that **stores unique elements in sorted order**.  
- Backed by a **Red-Black Tree**.  
- Provides O(log n) performance for **add, remove, and contains**.  
- Maintains elements in **ascending order** by default (can be customized with a comparator).

## HashMap

- A HashMap is part of Java’s **java.util** package.
- It stores data in **key–value** pairs.
- Keys are unique, but values can be duplicated.
- It uses hashing to provide constant-time performance for **put()** and **get()** operations (on average).

## TreeSet

- A TreeSet is part of Java’s **java.util** package.
- It is a SortedSet implementation that stores elements in ascending order (natural order by default).
- It does not allow duplicates.
- Internally uses a **Red-Black Tree** for ordering.

Example use: storing a sorted list of unique usernames.

## Iterators

- An Iterator is an object used to traverse (iterate) through collections in Java.
- It provides methods
- **hasNext()** → checks if more elements exist.
- **next()** → returns the next element.
- **remove()**→ removes the current element during iteration.

Iterators are useful when you want to safely iterate while modifying a collection.
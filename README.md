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

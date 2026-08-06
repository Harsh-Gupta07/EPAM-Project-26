# Problem 2 - Emergency Route Validation

## Problem Statement

A country's transportation department models its highway system as a connected undirected graph. Each city is represented by a vertex and each highway by an edge.

A city is considered **efficiently reachable** if the shortest path from the capital city (City 1) to that city is less than or equal to **D** roads.

The task is to count the total number of efficiently reachable cities, including the capital.

---

## Approach

1. Read the number of cities, roads, and the maximum allowed distance.
2. Build the graph using an adjacency list.
3. Perform Breadth First Search (BFS) starting from City 1.
4. Calculate the shortest distance to every city.
5. Count all cities whose distance is less than or equal to **D**.
6. Print the final count.

---

## Algorithm

- Store the graph using an adjacency list.
- Perform BFS from City 1.
- Compute the shortest distance to every city.
- Count all valid cities.

---

## Time Complexity

```
O(N + M)
```

## Space Complexity

```
O(N)
```

---

## Concepts Used

- Graph
- Breadth First Search (BFS)
- Queue
- Adjacency List

---

## Language

Java

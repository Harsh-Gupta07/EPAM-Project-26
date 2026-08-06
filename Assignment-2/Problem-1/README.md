# Problem 1 - Tree of Trusted Servers

## Problem Statement

A multinational organization stores its communication network as a tree where each server has a unique security key. A server is considered **trusted** if the XOR of all security keys from the root server (Server 1) to that server is greater than or equal to the given threshold **K**.

The task is to count the total number of trusted servers.

---

## Approach

1. Read the number of servers and the threshold value.
2. Store the security keys of all servers.
3. Represent the tree using an adjacency list.
4. Perform Depth First Search (DFS) starting from the root node.
5. Maintain the XOR value from the root to the current node.
6. If the XOR value is greater than or equal to **K**, increase the count.
7. Continue until all nodes are visited.
8. Print the total trusted servers.

---

## Algorithm

- Build the tree using an adjacency list.
- Traverse the tree using DFS.
- Update the XOR value while visiting each node.
- Count all nodes satisfying the given condition.

---

## Time Complexity

```
O(N)
```

## Space Complexity

```
O(N)
```

---

## Concepts Used

- Trees
- Depth First Search (DFS)
- XOR Operation
- Adjacency List

---

## Language

Java

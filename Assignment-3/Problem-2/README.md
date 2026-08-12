# Problem 2 - Maximum Learning Points

## Problem Statement

A student has a sequence of topics with different learning points.

The student cannot select two consecutive topics because of fatigue.

The objective is to find the maximum learning points that can be obtained without selecting two consecutive topics.

## Approach

This problem is solved using **Dynamic Programming**.

For every topic, we have two choices:

- Do not select the current topic.
- Select the current topic and skip the previous topic.

We store the maximum points possible up to each topic.

## Algorithm

1. Read the number of topics.
2. Store the learning points of each topic.
3. Create a DP array.
4. For the first topic, store its points.
5. For the second topic, choose the maximum of the first two points.
6. For every remaining topic:
   - Either skip the current topic.
   - Or select it and add its points to the result from two positions before.
7. Store the maximum of these two choices.
8. Print the final maximum points.

## Time Complexity

O(N)

## Space Complexity

O(N)

## Concepts Used

- Dynamic Programming
- Arrays
- Optimization

## Language

Java

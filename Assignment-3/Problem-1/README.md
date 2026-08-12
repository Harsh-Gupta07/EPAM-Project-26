# Problem 1 - Scholarship Distribution

## Problem Statement

A college has a limited budget for scholarships. Each student has a minimum scholarship amount they are willing to accept.

The objective is to award scholarships to the **maximum number of students** without exceeding the total available budget.

Each student can receive at most one scholarship.

## Approach

The problem can be solved using a **Greedy Algorithm**.

We sort all scholarship requirements in increasing order and select students starting from the student requiring the smallest scholarship.

This allows us to select the maximum possible number of students within the given budget.

## Algorithm

1. Read the number of students and total budget.
2. Store the minimum scholarship required by each student.
3. Sort the scholarship amounts in increasing order.
4. Start with a total scholarship amount of 0.
5. Select students from the smallest scholarship requirement.
6. If adding the current scholarship does not exceed the budget, select the student.
7. Otherwise, stop because all remaining scholarships are equal to or greater than the current amount.
8. Print the number of selected students.

## Time Complexity

O(N log N)

The sorting operation takes O(N log N) time.

## Space Complexity

O(1) excluding the space used by the sorting algorithm.

## Concepts Used

- Greedy Algorithm
- Arrays
- Sorting

## Language

Java

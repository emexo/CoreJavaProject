package com.coding.exercise;

// Java implementation of the approach

import java.util.LinkedList;
import java.util.Queue;

class GFG {

    // Function to push element in last by
// popping from front until size becomes 0
    static void FrontToLast(Queue<Integer> q,
                            int qsize) {
        // Base condition
        if (qsize <= 0)
            return;

        // pop front element and push
        // this last in a queue
        q.add(q.peek());
        q.remove();

        // Recursive call for pushing element
        FrontToLast(q, qsize - 1);
    }

    // Function to push an element in the queue
// while maintaining the sorted order
    static void pushInQueue(Queue<Integer> q,
                            int temp, int qsize) {

        // Base condition
        if (q.isEmpty() || qsize == 0) {
            q.add(temp);
            return;
        }

        // If current element is less than
        // the element at the front
        else if (temp >= q.peek()) {

            // Call stack with front of queue
            q.add(temp);

            // Recursive call for inserting a front
            // element of the queue to the last
            FrontToLast(q, qsize);
        } else {

            // Push front element into
            // last in a queue
            q.add(q.peek());
            q.remove();

            // Recursive call for pushing
            // element in a queue
            pushInQueue(q, temp, qsize - 1);
        }
    }

    // Function to sort the given
// queue using recursion
    static void sortQueue(Queue<Integer> q) {

        // Return if queue is empty
        if (q.isEmpty())
            return;

        // Get the front element which will
        // be stored in this variable
        // throughout the recursion stack
        int temp = q.peek();

        // Remove the front element
        q.remove();

        // Recursive call
        sortQueue(q);

        // Push the current element into the queue
        // according to the sorting order
        pushInQueue(q, temp, q.size());
    }

    // Driver code
    public static void main(String[] args) {

        // Push elements to the queue
        Queue<Integer> qu = new LinkedList<>();
        qu.add(10);
        qu.add(7);
        qu.add(16);
        qu.add(9);
        qu.add(20);
        qu.add(5);

        // Sort the queue
        sortQueue(qu);

        // Print the elements of the
        // queue after sorting
        while (!qu.isEmpty()) {
            System.out.print(qu.peek() + " ");
            qu.remove();
        }
    }
}

// This code is contributed by PrinciRaj1992

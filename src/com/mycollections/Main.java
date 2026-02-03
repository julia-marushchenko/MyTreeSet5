/**
 *  Java program to demonstrate TreeSet collection.
 */

package com.mycollections;

import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating an empty TreeSet.
        TreeSet<Integer> mySet = new TreeSet<>();

        // Adding elements to mySet.
        mySet.add(4);
        mySet.add(7);
        mySet.add(9);
        mySet.add(3);
        mySet.add(12);
        mySet.add(10);
        mySet.add(14);

        // Printing mySetToConsole.
        System.out.println(mySet);

        // Printing minimum value of mySet.
        System.out.println("Minimun element: " + mySet.first());

        // Printing maximum value of mySet.
        System.out.println("Maximum element: " + mySet.last());

        // Remove element with value 12.
        mySet.remove(12);

        // Printing mySetToConsole.
        System.out.println(mySet); // Output: [3, 4, 7, 9, 10, 14]

        // Remove all elements from mySet.
        mySet.clear();

        // Printing mySetToConsole.
        System.out.println(mySet); // Output: []
    }
}
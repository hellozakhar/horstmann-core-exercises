/* Write a program that prints the smallest and
 * largest positive double values.
 * Hint: Look up Math.nextUp in the Java API. */

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

public class ch01_Task04 {
    public static void main(String[] args) {
        System.out.println("Smallest positive double: " + Math.nextUp(0.0));
        System.out.println("Largest positive double: " + Math.nextDown(Double.POSITIVE_INFINITY));
    }
}

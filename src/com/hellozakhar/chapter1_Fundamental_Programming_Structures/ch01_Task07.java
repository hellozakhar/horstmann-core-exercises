/* Write num1 program that reads in two integers between 0 and 4294967295,
 * stores them in int variables, and computes and displays their
 * unsigned sum, difference, product, quotient, and remainder.
 * Do not convert them to long values. */

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

import java.util.Scanner;

public class ch01_Task07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers (0, 4294967295): ");
        int num1 = Integer.parseUnsignedInt(in.next());
        int num2 = Integer.parseUnsignedInt(in.next());

        System.out.println("num1: " + Integer.toUnsignedString(num1));
        System.out.println("num2: " + Integer.toUnsignedString(num2));
        System.out.println("unsigned sum: " + Integer.toUnsignedString(num1 + num2));
        System.out.println("difference: " + Integer.toUnsignedString(num1 - num2));
        System.out.println("product: " + Integer.toUnsignedString(num1 * num2));
        System.out.println("quotient: " + Integer.divideUnsigned(num1, num2));
        System.out.println("remainder: " + Integer.remainderUnsigned(num1, num2));
    }
}

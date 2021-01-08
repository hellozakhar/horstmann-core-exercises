/* Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
 * Print the reciprocal as a hexadecimal floating-point number.*/

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

import java.util.Scanner;

public class ch01_Task01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = in.nextInt();

        System.out.printf("Binary: %s\n", Integer.toString(number, 2));
        System.out.printf("Octal: %#o\n", number);
        System.out.printf("Hexadecimal: %#X\n", number);
    }
}

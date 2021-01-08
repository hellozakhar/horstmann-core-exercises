/* Using only the conditional operator, write a program
 * that reads three integers and prints the largest.
 * Repeat with Math.max.*/

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

import java.util.Scanner;

public class ch01_Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 integers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = num1;

        if (max < num2)
            max = num2;

        if (max < num3)
            max = num3;

        System.out.println("Max of 3 integers (Math.max) is: " + max);
        System.out.println("Max of 3 integers (Math.max) is: " + Math.max(num1, Math.max(num2, num3)));
    }
}

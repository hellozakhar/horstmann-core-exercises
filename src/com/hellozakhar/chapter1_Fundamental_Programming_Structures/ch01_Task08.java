/* Write a program that reads a string and prints all of its nonempty substrings.*/

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

import java.util.Scanner;

public class ch01_Task08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        for (int lower = 0; lower < input.length(); lower++) {
            for (int upper = lower; upper < input.length(); upper++) {
                System.out.println(input.substring(lower, upper + 1));
            }
        }
    }
}

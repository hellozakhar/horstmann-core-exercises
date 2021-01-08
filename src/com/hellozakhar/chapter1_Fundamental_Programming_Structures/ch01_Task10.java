/* Write a program that produces a random string
 * of letters and digits by generating a random long
 * value and printing it in base 36. */

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

import java.util.Random;

public class ch01_Task10 {
    public static void main(String[] args) {
        Random rd = new Random();
        Long value = rd.nextLong();
        System.out.println(Long.toString(value, 36));
    }
}

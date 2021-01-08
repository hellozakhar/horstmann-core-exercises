/* Write a program that reads an integer angle (which may be positive or negative)
 * and normalizes it to a value between 0 and 359 degrees.
 * Try it first with the % operator, then with floorMod. */

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.floorMod;

public class ch01_Task02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter angle: ");
        int angle = in.nextInt();

        int result = angle % 360;

        if (result < 0)
            result = 360 + result;

        System.out.println("Normalize angle via operator%: " + result);
        System.out.println("Normalize angle via floorMod: " + floorMod(angle, 360));
    }
}

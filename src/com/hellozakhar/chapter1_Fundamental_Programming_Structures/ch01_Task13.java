/* Write a program that prints a lottery combination,
 * picking six distinct numbers between 1 and 49.
 * To pick six distinct numbers, start with an array
 * list filled with 1...49. Pick a random index and
 * remove the element. Repeat six times.
 * Print the result in sorted order.*/

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

import java.util.ArrayList;
import java.util.Random;

public class ch01_Task13 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        ArrayList picked = new ArrayList();
        Random rd = new Random();
        int upper = 49;
        int times = 6;
        int rdindex = 0;

        for (int i = 0; i < upper; i++) {
            arr.add(i+1);
        }

        System.out.println(arr.toString());

        for (int t = 0; t < times; t++) {
            rdindex = rd.nextInt(upper - t);

            if (!picked.contains(arr.get(rdindex))) {
                picked.add(arr.remove(rdindex));
            } else {
                t--;
            }
        }


        System.out.println(picked.toString());
        System.out.println(arr.toString());

    }
}

/* What happens when you cast a double to an int
 * that is larger than the largest possible int value? Try it out.*/

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

public class ch01_Task05 {
    public static void main(String[] args) {
        System.out.println((int) (Integer.MAX_VALUE + 1));
    }
}

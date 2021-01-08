/* Section 1.5.3, “String Comparison” (page 25) has an example
 * of two strings s and t so that s.equals(t) but s != t.
 * Come up with a different example that doesn’t use substring).*/

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

public class ch01_Task09 {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1 == str2: " + (str1 == str2));
    }
}

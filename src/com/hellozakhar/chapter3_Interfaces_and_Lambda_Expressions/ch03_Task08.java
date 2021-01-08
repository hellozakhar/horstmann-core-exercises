/* Implement the method
 * void luckySort(ArrayList<String> strings, Comparator<String> comp)
 * that keeps calling Collections.shuffle on the array list
 * until the elements are in increasing order, as determined by the comparator.*/

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

import java.util.*;

public class ch03_Task08 {

    private static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (!isSorted(strings, comp)) {
            Collections.shuffle(strings);
        }
    }

    private static boolean isSorted(ArrayList<String> strings, Comparator<String> comp) {
        for (int i = 0; i < strings.size() - 1; i++) {
            if (comp.compare(strings.get(i+1), strings.get(i)) < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        Random rd = new Random();
        int wordCount = 5;

        for (int i = 0; i < wordCount; i++) {
            StringBuilder str = new StringBuilder("");
            int wordLength = rd.nextInt(10) + 1;
            for (int j = 0; j < wordLength; j++) {
                str.append(Character.toChars(rd.nextInt(25) + 65));
            }
            al.add(str.toString());
        }

        System.out.println("original array: " + al);
        luckySort(al, (s1, s2) -> s1.length() - s2.length());
        System.out.print("sorted array: ");
        System.out.println(al);
    }
}

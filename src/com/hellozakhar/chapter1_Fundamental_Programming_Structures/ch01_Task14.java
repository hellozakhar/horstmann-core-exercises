/* Write a program that reads a two-dimensional array of integers
 * and determines whether it is a magic square
 * (that is, whether the sum of all rows, all columns,
 * and the diagonals is the same).
 * Accept lines of input that you break up into individual integers,
 * and stop when the user enters a blank line. For example, with the input
 * 16 3 2 13
 * 5 10 11 8
 * 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively. */

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

import java.util.ArrayList;
import java.util.Scanner;

public class ch01_Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList <Integer>> matrix = new ArrayList<>();

        String s;

        while (!"".equals(s = in.nextLine().trim())) {
            String[] nums = s.split("\\s+");
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                row.add(Integer.valueOf(nums[i]));
            }
            matrix.add(row);
        }

        int dim = matrix.size();
        for (ArrayList<Integer> row : matrix) {
            if (row.size() != dim) {
                System.out.println("Incorrect dimensions!");
                return;
            }
        }

        int sum = matrix.get(0).stream().mapToInt(Integer::intValue).sum();
        int tsum;

        for (int i = 0; i < dim; i++) {
            tsum = 0;
            for (int j = 0; j < dim; j++) {
                tsum += matrix.get(i).get(j).intValue();
            }
            if (sum != tsum) {
                System.out.println("Not a magic matrix!");
                return;
            }
        }

        for (int i = 0; i < dim; i++) {
            tsum = 0;
            for (int j = 0; j < dim; j++) {
                tsum += matrix.get(j).get(i).intValue();
            }
            if (sum != tsum) {
                System.out.println("Not a magic matrix!");
                return;
            }
        }

        tsum = 0;
        for (int j = 0; j < dim; j++) {
            tsum += matrix.get(j).get(j).intValue();
        }
        if (sum != tsum) {
            System.out.println("Not a magic matrix!");
            return;
        }

        tsum = 0;
        for (int j = 0; j < dim; j++) {
            tsum += matrix.get(dim - 1 - j).get(j).intValue();
        }
        if (sum != tsum) {
            System.out.println("Not a magic matrix!");
            return;
        }

        System.out.println("Magic matrix!");

    }
}

/* Write a program that computes the factorial
 * n! = 1 × 2 × . . . ×n,
 * using BigInteger. Compute the factorial of 1000. */

package com.hellozakhar.chapter1_Fundamental_Programming_Structures;

import java.math.BigInteger;

public class ch01_Task06 {

    private BigInteger fact(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Number is less than zero!");
        if (n == 0 || n == 1)
            return BigInteger.ONE;

        BigInteger result = BigInteger.ONE;
        for(int i = 1; i < n; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }

    public static void main(String[] args) {
        ch01_Task06 obj = new ch01_Task06();
        System.out.println("Factorial of 1000 is: " + obj.fact(1000));

    }
}

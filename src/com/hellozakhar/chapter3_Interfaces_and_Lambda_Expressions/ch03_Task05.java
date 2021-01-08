/* Add a static method with the name constant of the
 * IntSequence class that yields an infinite constant sequence.
 * For example,
 * IntSequence.constant(1)
 * yields values 1 1 1..., ad infinitum.
 * Extra credit if you do this with a lambda expression. */

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

public class ch03_Task05 {
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.constant(1);

        for (int i = 0; i < 42; i++) {
            System.out.print(sequence.next() + " ");
        }
    }
}

/* Implement a class Greeter that implements Runnable
 * and whose run method prints n copies of "Hello, " + target,
 * where n and target are set in the constructor.
 * Construct two instances with different messages
 * and execute them concurrently in two threads. */

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

public class ch03_Task09 {
    public static void main(String[] args) {
        new Thread(new Greeter(12, "first")).start();
        new Thread(new Greeter(15, "second")).start();
    }
}

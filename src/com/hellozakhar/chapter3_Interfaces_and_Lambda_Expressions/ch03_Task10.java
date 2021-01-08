/* Implement methods
 * public static void runTogether(Runnable... tasks)
 * public static void runInOrder(Runnable... tasks)
 * The first method should run each task in
 * a separate thread and then return.
 * The second method should run all methods in
 * the current thread and return when the last one has completed. */

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

public class ch03_Task10 {
    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks) {
            new Thread(task).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }

    public static void main(String[] args) {
        Task task01 = new Task("task01");
        Task task02 = new Task("task02");

        System.out.println("in order...");
        runInOrder(task01, task02, task01, task02, task01, task02,task01, task02);
        System.out.println("together...");
        runTogether(task01, task02, task01, task02, task01, task02,task01, task02);
    }
}
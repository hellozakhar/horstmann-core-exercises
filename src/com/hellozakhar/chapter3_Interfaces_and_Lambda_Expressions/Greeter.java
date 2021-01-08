package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

public class Greeter implements Runnable {
    private int count;
    private String target;

    public Greeter(int count, String target) {
        this.count = count;
        this.target = target;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello, " + target);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

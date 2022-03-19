package com.company;

public class MyThread implements Runnable {
    final private String threadName;

    MyThread(String name) {
        threadName = name;
        System.out.println("Thread " + threadName + " creating..");
    }

    // provides entry point for the thread, put complete business logic inside this method
    public void run() {
        System.out.println("Thread " + threadName + " running..");
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting..");
    }

    public static void main(String[] args) {
        MyThread r1 = new MyThread("One");
        Thread t1 = new Thread(r1);
        t1.start();

        MyThread r2 = new MyThread("Two");
        Thread t2 = new Thread(r2);
        t2.start();
    }
}



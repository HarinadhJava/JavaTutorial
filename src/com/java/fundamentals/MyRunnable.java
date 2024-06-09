package com.java.fundamentals;

public class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println("This is run method of runnable class");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();

        Thread thread1 = new Thread(mr);
        System.out.println(Thread.currentThread().getName());
        thread1.setName("My Thread -1");
        thread1.start();  // role of start method is to execute run method
    }
}


class MyThread extends Thread{

    public  void run(){
        System.out.println("This is overridden MyThread run method");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.run();
        mt.setName("Thread - ONE");
        mt.start();
    }
}
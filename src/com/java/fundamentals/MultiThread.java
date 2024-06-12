package com.java.fundamentals;

public class MultiThread {

    public static void main(String[] args) {

        MyThr mt = new MyThr();
        Thread t1 = new Thread(mt);
        t1.setName("My Thread ONE");

        Thread t2 = new Thread(mt);
        t2.setName("My Thread TWO");

     /*   t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);*/

        t1.start();
        t2.start();

    }
}

class MyThr implements Runnable {
    int availableTickets = 1;

    @Override
    public void run() {
        bookTicket();
    }

    private void bookTicket() {

        synchronized (this) {
            if (availableTickets > 0) {
                System.out.println("Ticket Booked for " + Thread.currentThread().getName());
                availableTickets--;
            } else {
                System.out.println("No Tickets are available :" + Thread.currentThread().getName());
            }
        }

    }

}

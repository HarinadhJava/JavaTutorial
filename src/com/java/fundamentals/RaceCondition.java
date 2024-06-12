package com.java.fundamentals;

public class RaceCondition {

    public static void main(String[] args) {

        Reservation reservation = new Reservation();
        Reservation reservatio2 = new Reservation();
        Thread t1 = new Thread(reservation, "Passanger1");
        Thread t2 = new Thread(reservatio2, "Passanger2");

        t1.start();
        t2.start();
    }
}

class Reservation implements Runnable {
    int availableTickets = 1;

    @Override
    public void run() {
        synchronized (Reservation.class) {
            if (availableTickets > 0) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Ticket Booked for " + Thread.currentThread().getName());
                    availableTickets--;
                    System.out.println("Cuurenly available tickets :" + availableTickets);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Ticket Not available for " + Thread.currentThread().getName());
            }
        }
    }
}

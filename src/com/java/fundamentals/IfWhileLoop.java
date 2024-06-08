package com.java.fundamentals;

public class IfWhileLoop {

    public static void main(String[] args) {
        IfWhileLoop.m1();
    }

    static void m1() {

        //for loop need to repeat 5 times

        for (int i = 0; i < 100; i++) {

            System.out.println("Hello: " + i);

            for (int j = 1; j < 6; j++) {

                System.out.println("Nested for loop");
            }
        }

        //while loop

        int no = 1;




        while (no < 100) {
            System.out.println("while loop :" + no);
            no++;
        }

    }
}

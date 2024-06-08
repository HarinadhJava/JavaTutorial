package com.java.fundamentals;

public class Patterns {

    public static void main(String[] args) {
        Patterns.pattern1();
        System.out.println("===================");
        Patterns.pattern2();
        System.out.println("==============");
        Patterns.pattern3();
    }

     static void pattern3() {

        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern1() {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {

        for (int i = 4; i > 0; i--) {

            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package com.java.fundamentals;

public class PrimitiveDataTypesExample {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.m1((byte) 889898899); //min-128 max 127
    }
}


class MyClass{

    double total = 2.9;
    int no = (int) total;

    void m1(byte x){
        System.out.println("This is byte method "+x);
        System.out.println("n0 value "+no);
    }

    void m1(short x){
        System.out.println("This is short method "+x);
    }

   /* void m1(double x){
        System.out.println("This is double method "+x);
    }

    void m1(short x){
        System.out.println("This is short method "+x);
    }*/

  /*  void m1(int x){
        System.out.println("This is int method "+x);
    }

    void m1(byte x){
        System.out.println("This is byte method "+x);
    }*/
}
package com.java.fundamentals;

import java.util.ArrayList;

public interface MyInterface {

    int i = 10;

    int test();

    void m1(String input);
}


class MyImplementation1 implements MyInterface {

    @Override
    public int test() {
        System.out.println("This is test method");
        return 100;
    }

    @Override
    public void m1(String input) {
        System.out.println("This is m1 method");
    }

    public static void main(String[] args) {
        MyInterface imp1 = new MyImplementation1();
        imp1.m1("hsasa");
        imp1.test();
        System.out.println(imp1.i);

        MyInterface imp2 = new MyImplementation1();
        imp2.m1("hsasa");
        imp2.test();
        System.out.println(imp1.i);

        MyInterface imp3 = new MyImplementation1();
        imp3.m1("hsasa");
        imp3.test();
        System.out.println(imp1.i);
    }
}





interface I1{

    void b1();
    void b2();
}


interface I2{

    void b2();
}


class Abc implements I1, I2{

    @Override
    public void b1() {

    }

    @Override
    public void b2() {

    }

    public static void main(String[] args) {
        Abc ob1 = new Abc();
        ob1.b1();
        ob1.b2();
    }
}



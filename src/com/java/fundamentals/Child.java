package com.java.fundamentals;

public class Child extends Parent{

    public Child(){
        this(12);
        System.out.println("This is child class constructor");
    }

    public  Child(int d){
        super(1212, "wewew");
        System.out.println("dsss");
    }
}

class Parent{

    public Parent(int id, String name){
        System.out.println("This is Parent cass Constructor");
    }

}


class Test{
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}
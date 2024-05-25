package com.java.fundamentals;

public class ConstructorThisExample {


    public ConstructorThisExample() {
        this(100);

    }

    public ConstructorThisExample(int id) {
        this("asasa");
        System.out.println("This is int arg");
    }


    public ConstructorThisExample(String name) {
        this(100, "dsds", "sasa");
        System.out.println("This is String arg");

    }


    public ConstructorThisExample(int id, String name, String a) {
        System.out.println("This is int, String, String args");
    }

    public static void main(String[] args) {
        ConstructorThisExample ob1 = new ConstructorThisExample();

    }
}

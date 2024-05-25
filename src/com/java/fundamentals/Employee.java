package com.java.fundamentals;

public class Employee {

    int id;
    String name;

    Employee(){
        System.out.println("Hello");
    }

    Employee(int id){
        System.out.println("This is int arg constructor");
       this.id = id;
    }

    Employee(String sal){
        System.out.println("This is String expe");
    }

    Employee(String sal, int abc){
        System.out.println("This is two args expe");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e3 = new Employee(1222);

        Employee e2 = new Employee("Jhsjda");

        Employee e4 = new Employee("Jhsjda", 100);

    }


}

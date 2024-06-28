package com.java.fundamentals.collection;

import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {

        Employee e1 = new Employee(100, "Alex");
        Employee e2 = new Employee(101, "John");
        Employee e3 = new Employee(102, "Scott");
        Employee e4 = new Employee(103, "Miller");
        Employee e5 = new Employee(104, "King");

        LinkedList<Employee> ll = new LinkedList<>();
        ll.add(e5);
        ll.add(e1);
        ll.add(e2);
        ll.add(e4);
        ll.add(e3);

        System.out.println(ll);

    }

}


class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
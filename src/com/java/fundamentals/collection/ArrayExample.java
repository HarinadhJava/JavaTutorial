package com.java.fundamentals.collection;

import java.util.ArrayList;

public class ArrayExample {


    public static void main(String[] args) {

        Employee e1 = new Employee(100, "Alex", "alex@gmail.com", "Mechanical");
        Employee e2 = new Employee(101, "Max", "max@gmail.com", "Pharmacy");
        Employee e3 = new Employee(103, "Miller", "miller@gmail.com", "Civil");
        Employee e4 = new Employee(104, "Scott", "scott@yahoo.com", "CSE");
        Employee e5 = new Employee(105, "Thomas", "thomas@rediff.com", "Mining");
        Employee e6 = new Employee(105, "Thomas", "thomas@rediff.com", "Mining");

        Employee[] empArray = new Employee[5];
        empArray[0] = e1;
        empArray[1] = e3;
        empArray[2] = e4;
        empArray[3] = e2;
        empArray[4] = e5;

        for(int i=0;i<empArray.length;i++){
            System.out.println(empArray[i]);
        }

        System.out.println("Collections Example");

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);


        System.out.println("Displaying 4th index value :"+list.get(4));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

class Employee{

    private int id;
    private String name;
    private String email;
    private String deptName;

    public Employee(int id, String name, String email, String deptName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

package com.java.fundamentals;

public class ConditionalStatements {

    void m1(int no1, int no2) {

        if (no1 == no2) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }

        if (no1 > no2)
            System.out.println("Checking for out if curly brase condition");
        else
            System.out.println("This is else without curly");

        if (no1 < no2) {
            System.out.println("Condition1 if");
        } else if (no1 != no2) {
            System.out.println("condtion2 if");
        } else {
            System.out.println("Else bock");
        }

        if ("abc".equals("abc")) {
            System.out.println("Both are equals Strings");
        } else {
            System.out.println("Both are not equals Strings");
        }

        if (m3()) {
            System.out.println("If block");
        } else {
            System.out.println("Else block");
        }

        //switch statement
        System.out.println("End of method m1");
    }

    boolean m3() {
        return true;
    }

    void m2(char grade) {
        System.out.println("hjdshjs");
        switch (grade) {
            case 'A':
                System.out.println("GRADE A MARKS >=80");
                break;
            case 'B':
                System.out.println("GRADE B  MARKS >=60");
                break;
            case 'C':
                System.out.println("GRADE C MARS >=40");
                break;
            case 'F':
                System.out.println("GRADE F Marks <40 FAIL");
                break;
            default:
                System.out.println("INVALID GRADE");
                break;
        }
    }

    public static void main(String[] args) {
        ConditionalStatements cs = new ConditionalStatements();
        cs.m1(20, 20);
        cs.m2('C');
    }
}

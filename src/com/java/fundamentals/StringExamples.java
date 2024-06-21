package com.java.fundamentals;

public class StringExamples {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = new String("abc");
        String s5 = new String("abc").intern();

        System.out.println("Comparing Mode");
        String ss = "sjdhsk";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);

        System.out.println(s1.equals(s2));
        System.out.println();
        System.out.println(s1.equals(ss));


    }
}

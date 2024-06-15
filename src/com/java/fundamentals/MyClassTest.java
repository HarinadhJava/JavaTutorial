package com.java.fundamentals;

public class MyClassTest extends  Object {
    int id;

    public MyClassTest(int id) {
        this.id = id;
    }

    public String toString(){
        System.out.println("This is overriden toString method");
        return " c";
    }

    public int hashCode(){
        return id;
    }

}

class Testing {
    public static void main(String[] args) {

        MyClassTest mt = new MyClassTest(100);
        System.out.println(mt.toString());

        MyClassTest mt1 = new MyClassTest(200);


        MyClassTest mt3 = new MyClassTest(100);

        System.out.println(mt.hashCode());
        System.out.println(mt1.hashCode());
        System.out.println(mt3.hashCode());

        if(mt.hashCode() == mt1.hashCode()){
            System.out.println("Both objects are same");
        }else{
            System.out.println("Both are different");
        }
    }
}
package com.java.fundamentals;

public class LogicalOpetatrs {

    void m1(int x, int y) {

        //sum
        int sum = x + y;
        System.out.println("Sum of of x and y " + sum);

        //substract

        int sub = x - y;
        System.out.println("Substract of of x and y " + sub);

        //conditional operator
        //if condition
        if(x==y){
            System.out.println("Both x and y are equal");
        }else{
            System.out.println("Both x and y are not equals");
        }

        //! example

        if ((x != y)) {
            System.out.println("Both are not equal");
        } else {
            System.out.println("Both are equal");
        }

        //< operator

        if(x<y){

        }else{

        }
        if(x>y){

        }else{

        }
        if(x>=y){

        }else{

        }
        if(x<=y){

        }else{

        }
        x++;
        y--;

        System.out.println("x value " + x);
        System.out.println("y value " + y);


        System.out.println("-============================");

        int a = 4;
        int b = 2;

        if((a==b) && (x==y)){
            System.out.println("This if of cond");
        }else{
            System.out.println("Thi is else cond");
        }

        System.out.println((a==4) & (b==10));

        System.out.println(m2() && m3());
        //| and || condition

        if(1==3 || 2==5 || 4==4 || 5==10){
            System.out.println("This is SIngle OR if condition");
        }else{
            System.out.println("This is else part");
        }


    }


    boolean m2(){
        return false;
    }
    boolean m3(){
        //100 lines
        return true;
    }

    public static void main(String[] args) {
        LogicalOpetatrs l1 = new LogicalOpetatrs();
        l1.m1(20, 20);
    }
}

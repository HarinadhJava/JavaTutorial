package com.java.fundamentals;

public abstract class MyAbstractClass {
    int id;
    String name;
    abstract void m1();
    void m3(){

    }
    void m2(){
        System.out.println("This m2 of abstract class instance method");
    }

    public MyAbstractClass(int id, String name) {
        super();
        this.id = id;
        this.name = name;
        System.out.println("This is Parent cass constructor");
    }
}

class ConcreteClass extends MyAbstractClass{

    public ConcreteClass() {
        super(123, "abc");
        System.out.println("This is child class constructor");
    }

    @Override
    void m1() {
        System.out.println("This is m1 implementation");
    }

    public static void main(String[] args) {
        ConcreteClass c1 = new ConcreteClass();
        c1.m1();
        c1.m2();
    }
}

abstract class A{

    void m1(){

    }
    void m2(){

    }
    abstract int m4();
    abstract void test();
}

class B extends  A{

    @Override
    int m4() {
        return 0;
    }

    @Override
    void test() {

    }
}


interface I{
    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
    void m6();
    void m7();
    void m8();
    void m9();
    void m10();

}

abstract class Abs implements I{

    public void m5(){
        // 60 lines of code
    }
    // 3 more methods
}

// 10 implementation classes


class C1 extends Abs{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m6() {

    }

    @Override
    public void m7() {

    }

    @Override
    public void m8() {

    }

    @Override
    public void m9() {

    }

    @Override
    public void m10() {

    }
}

class C2 extends Abs{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m6() {

    }

    @Override
    public void m7() {

    }

    @Override
    public void m8() {

    }

    @Override
    public void m9() {

    }

    @Override
    public void m10() {

    }
}
class C3 extends Abs{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m6() {

    }

    @Override
    public void m7() {

    }

    @Override
    public void m8() {

    }

    @Override
    public void m9() {

    }

    @Override
    public void m10() {

    }
}
class C4 extends Abs{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m6() {

    }

    @Override
    public void m7() {

    }

    @Override
    public void m8() {

    }

    @Override
    public void m9() {

    }

    @Override
    public void m10() {

    }
}
class C5 extends Abs{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m6() {

    }

    @Override
    public void m7() {

    }

    @Override
    public void m8() {

    }

    @Override
    public void m9() {

    }

    @Override
    public void m10() {

    }
}
class C10 extends Abs{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m6() {

    }

    @Override
    public void m7() {

    }

    @Override
    public void m8() {

    }

    @Override
    public void m9() {

    }

    @Override
    public void m10() {

    }
}
































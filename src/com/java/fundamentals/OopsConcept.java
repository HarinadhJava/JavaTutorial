package com.java.fundamentals;

public class OopsConcept {

    public static void main(String[] args) {

        Movie m1 = new Movie();
       // m1.id = 123;Mad AMx");
        // String [] str = {"Kalki", "abc"};
        //  m1.e = str;

        //1000 classes you have

        m1.setId(123);
        m1.setName("Mad Max");

        Movie m2 = new Movie();

        m2.setId(24);
        m2.setName("DarkNight");

        System.out.println(m1.getId());

        ParentClass p1 = new ParentClass();
        ChildClass c1 = new ChildClass();
        c1.setParentClass(p1);
        c1.prop1();
    }
}

class ParentClass{
    void method1(){
        System.out.println("Hello This parent class methhod1");
    }
}

class ChildClass{
    private ParentClass parentClass; // hsdgsh // initiaisze this variabe

    public void setParentClass(ParentClass parentClass) {
        this.parentClass = parentClass;
    }

    void prop1(){
        System.out.println("This is child Property");
        parentClass.method1();
    }

}
//encapsulation

class Movie {
    private int id;
    // String[] e;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


//Abstraction
// hiding the implementation


interface InterTest{
    void m1();
    void m2();
    void m3();
    //..... n number  of methods
}

class InterTestImpl implements InterTest{

    @Override
    public void m1() {
        System.out.println("This is m1");
    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

class InterTest1Impe implements InterTest{

    @Override
    public void m1() {
        System.out.println("Differe impe");
    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}




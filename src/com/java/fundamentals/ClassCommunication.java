package com.java.fundamentals;

public class ClassCommunication {

    public static void main(String[] args) {

        Engine engine = new Engine();

        SportsCar car1 = new SportsCar(engine);
        car1.pushStart();
        System.out.println("Setter method Example");

        Empl e1 = new Empl();
        Deptmnt dept = new Deptmnt();
        e1.setDeptmnt(dept);
        e1.showEmployee();
    }
}

class Empl {

    private Deptmnt deptmnt;

    public void setDeptmnt(Deptmnt deptmnt) {
        this.deptmnt = deptmnt;
    }

    void showEmployee() {
        System.out.println("Emp Id :" + 100);
        System.out.println("Emp Name :" + "Max");
        String returnedDeptName = deptmnt.getDeptName();
        System.out.println("DepartName :" + returnedDeptName);
    }
}

class Deptmnt {

    String getDeptName() {
        return "Mechanical";
    }

}


class SportsCar {

    private Engine sportsEngine;

    // inintialise the sportsEngine

    public SportsCar(Engine sportsEngine) {
        this.sportsEngine = sportsEngine;
    }

    void pushStart() {
        sportsEngine.start();

    }

    void test() {
        sportsEngine.m3();
    }
}

class Engine {

    boolean start() {
        System.out.println("Engine Started");
        return true;
    }

    void m3() {
        System.out.println("Hello word this is m3 method");
    }
}



// write 2 programs
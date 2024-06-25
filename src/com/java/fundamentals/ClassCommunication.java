package com.java.fundamentals;

public class ClassCommunication {

    public static void main(String[] args) {

        Engine engine = new Engine();

        SportsCar car1 = new SportsCar(engine);
        car1.pushStart();
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

    void test(){
        sportsEngine.m3();
    }
}

class Engine {

    boolean start() {
        System.out.println("Engine Started");
        return true;
    }

    void m3(){
        System.out.println("Hello word this is m3 method");
    }
}


// write 2 programs
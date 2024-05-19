package com.java.fundamentals;

public class Car {

    String modelNumber;
    String companyName;
    int price;

    public Car(String modelNumber, String companyName, int price) {
        this.modelNumber = modelNumber;
        this.companyName = companyName;
        this.price = price;
    }

    public void displayObjectData(){
        System.out.println(modelNumber);
        System.out.println(companyName);
        System.out.println(price);
        System.out.println("===================================");
    }

    public static void main(String[] args) {

        Car c1 = new Car("Creta", "Hyundai", 20000);
        c1.displayObjectData();
        Car c2 = new Car("Nexon", "Tata", 10000);
        c2.displayObjectData();
        Car c3 = new Car("Seltos", "Kia", 30000);
        c3.displayObjectData();
    }


}
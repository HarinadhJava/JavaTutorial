package com.java.fundamentals;

public class Apartment {

    //Variables
    int apartmentId;
    String apartmentName;
    String apartmentLocation;
    String builderName;
    int availableFlats;

    //VariableInitialization
    public Apartment(int apartmentId, String apartmentName, String apartmentLocation, String builderName, int availableFlats) {
        System.out.println("This is Constructor Block");
        this.apartmentId = apartmentId;
        this.apartmentName = apartmentName;
        this.apartmentLocation = apartmentLocation;
        this.builderName = builderName;
        this.availableFlats = availableFlats;
    }

    public Apartment() {

    }

    //method
    int findAvailableFlats(String inputApartmentName) {
        System.out.println("This is method logic ");
        return 0;
    }

    //instance Block

    {
        System.out.println("This is Instance Block");
    }

    //static Block

    static {
        System.out.println("This is static Block");
    }

    public static void main(String[] args) {

        //create Object
        Apartment ap1 = new Apartment(100, "My Home", "Gachibowli", "Myhome Builders", 2000); //
        int availableFLats = ap1.findAvailableFlats("Aparna"); //100
        if (availableFLats == 0) {
            System.out.println("No apartments ara available");
        } else {
            System.out.println("Available APartments " + availableFLats);
        }

        Apartment ap2 = new Apartment(101, "RajaPushpa", "Financial Dist", "Myhome Builders", 200);
        Apartment ap3 = new Apartment(102, "Aparna", "Gachibowli", "Myhome Builders", 6000);
        Apartment ap4 = new Apartment(103, "Prestige", "Gachibowli", "Myhome Builders", 4000);


    }
}

package com.java.fundamentals;

public class Bus {

    String busName;
    String source;
    String destination;

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBusName() {
        return busName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busName='" + busName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Bus b1 = new Bus();
        System.out.println(b1.toString());
        System.out.println("Testing getter methods");

        System.out.println(b1.getBusName());
        System.out.println(b1.getSource());
        System.out.println(b1.getDestination());

        System.out.println("Setting the value to b1");

        b1.setBusName("Rajadhani");
        b1.setSource("Hyderabad");
        b1.setDestination("Chennai");

        System.out.println("--------------");
        System.out.println(b1.toString());

        System.out.println(b1.getBusName());
        System.out.println(b1.getSource());
        System.out.println(b1.getDestination());

        System.out.println("Bus is Created");

    }
}

package com.java.fundamentals;

public class User {

    int userId;
    String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public void displayUserDetails() {
        System.out.println(userId);
        System.out.println(userName);
        System.out.println("-----------------------");
    }

    public String getUserName() {
        return "XYZ";
    }

    public int getUserId() {
        return 1;
    }

    public void m1(){
        System.out.println("Zero arg method");
    }

    public void m1(int id){
        System.out.println("int arg method");
    }
    public void m1(String name){
        System.out.println("String arg method");
    }
    public void m1(int id, String name){
        System.out.println("int and string arg method");
    }

    public static void s1(){
        System.out.println("This is Static method s1");
    }



    public static void main(String[] args) {
        User.s1();
      /*  User u1 = new User(100, "Alex");
        u1.displayUserDetails();

        u1.m1();
        u1.m1(123);
        u1.m1(123, "dghsgdhs");
        u1.m1("sjdjsd");

        String userNameReturnValue = u1.getUserName(); //"XYZ"

        int userIdReturnValue = u1.getUserId(); //1

        System.out.println(userNameReturnValue);
        System.out.println(userIdReturnValue);*/
    }
}

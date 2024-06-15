package com.java.fundamentals;

public class ArrayTest {
    //step1 declaring Array
    static String[] emailIds;

    public static void main(String[] args) {
        //step2 initialization
        emailIds = new String[10];

        //step3 adding data into Array
        emailIds[0] = "abc1@gmail.com";
        emailIds[1] = "abc2@gmail.com";
        emailIds[2] = "abc3@gmail.com";
        emailIds[3] = "abc4@gmail.com";
        emailIds[4] = "abc5@gmail.com";
        emailIds[5] = "abc6@gmail.com";
        emailIds[6] = "abc7@gmail.com";
        emailIds[7] = "abc8@gmail.com";
        emailIds[8] = "abc9@gmail.com";
        emailIds[9] = "abc10@gmail.com";

        String[] emails = {"abc1@gmail.com", "abc2#gmail.com"};

        // display all the data with in array
        System.out.println("Displaying Array Data");
       /* System.out.println(emailIds[0]);
        System.out.println(emailIds[1]);
        System.out.println(emailIds[2]);
        System.out.println(emailIds[3]);
        System.out.println(emailIds[4]);
        System.out.println(emailIds[5]);
        System.out.println(emailIds[6]);
        System.out.println(emailIds[7]);
        System.out.println(emailIds[8]);
        System.out.println(emailIds[9]);*/
        //displayng reverse order
        for (int i = 9; i >= 0; i--) {
            System.out.println(emailIds[i]);
        }

        System.out.println("Normal asc");

        for (int i = 0; i < 10; i++) {
            System.out.println(emailIds[i]);
        }

        int[] phoneNumbers = {123, 0, 789, 11, 1213, 5};

        System.out.println(phoneNumbers.length);

        for (int i = 0; i < 6; i++) {
            System.out.print(phoneNumbers[i] +" ");
        }
        System.out.println();

        System.out.println("Sorting Array");
        //Bubbble sort algorithm

        for (int i = phoneNumbers.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (phoneNumbers[j] > phoneNumbers[j + 1]) {
                    int temp = phoneNumbers[j];
                    phoneNumbers[j] = phoneNumbers[j + 1];
                    phoneNumbers[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(phoneNumbers[i]+"  ");
        }



    }
}

class Emp {
    int id;
 /*   String emailId1;
    String emailId2;
    String emailId3;
    String emailId4;
    String emailId5;
    String emailId6;
    String emailId7;
    String emailId8;
    String emailId9;
    String emailId10;
    ;*/

}

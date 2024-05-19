package com.java.fundamentals;

public class IdentifiersExample {

    int basicSalary = 10000;
    int bonus = 1000;

    int $FIXEDBONUS = 100;
    int _124Test = 100;
    // int 123Test = 1100; error don't allow with numbers

   /// boolean int  = true; -- reserved words never used as identifier

    public void calculateTotalSalary() {

        int totalSalary = basicSalary + bonus;
        System.out.println(totalSalary);
    }
}


class TestSample{

}

class DepartmentGroup{

}
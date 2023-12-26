package org.HomeWork;

public class R121Variables {
    /*
    declare 3 instance variables to hold an integer, double and char values.
Create 2 instances of the class and assign values to variables and the print them
**Expected Output:**
10
10.23
a
100
100.23
s
     */
    int num1;
    double num2;
    char c;
    void printInfo(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(c);
    }

    public static void main(String[] args) {
        R121Variables n1=new R121Variables();
        n1.num1=10;
        n1.num2=10.23;
        n1.c='a';
        n1.printInfo();

        R121Variables n2=new R121Variables();
        n2.num1=100;
        n2.num2=100.23;
        n2.c='s';
        n2.printInfo();
    }
}

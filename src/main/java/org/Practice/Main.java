package org.Practice;

public class Main {

        // Declare instance variables
        String name;
        int roll_no;

    public static void main(String[] args) {
        Main student = new Main();

        // Assign values to the instance variables
        student.roll_no = 2;
        student.name = "John";

        // Print the values
        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.roll_no);
    }
}


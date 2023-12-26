package org.HomeWork;

public class R113Method {
    /*
    Step1: Create a method that will accept with 2 parameters of integer type
Step2: Write the logic in that method in println statement to print hours and minutes
Step3: Call the method
**Expected Output:**
11:30
     */
    static void time (int hour, int minute){
        System.out.println(hour+":"+minute);
    }

    public static void main(String[] args) {
        time(11,30);
    }
}

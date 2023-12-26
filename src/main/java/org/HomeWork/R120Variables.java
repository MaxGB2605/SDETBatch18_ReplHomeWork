package org.HomeWork;

public class R120Variables {
    /*
    Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format:
**Expected Output:**
I am a student of batch 9 studying at Syntax in the year of 2021
     */
    private String schoolName;
    private int year;
    private int batchNum;
    void printInfo(){
        System.out.println("I am a student of batch "+batchNum+" studying at "+schoolName+" in the year of "+year);
    }

    public static void main(String[] args) {
        R120Variables sc = new R120Variables();
        sc.schoolName = "Syntax";
        sc.year = 2021;
        sc.batchNum = 9;
        sc.printInfo();
    }

}

package org.HomeWork;

public class R137AccessModifier {
    /*
   In main class please declared the variables using different access modifiers that will hold value for:
- name
- city
- name of the school
- batch number
Create a method to display details in following format:
My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
Assign values to the variables and execute method display
**Expected Output:**
My name is John and I live in Miami. I study at Syntax in batch 9
     */
    String name;
    private String city;
    protected String nameOfTheSchool;
    public int batchNumber;
    R137AccessModifier(String name, String city, String nameOfTheSchool, int batchNumber){
        this.name=name;
        this.city=city;
        this.nameOfTheSchool=nameOfTheSchool;
        this.batchNumber=batchNumber;
    }

    public void displayDetails(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+nameOfTheSchool+" in batch "+batchNumber);
    }

    public static void main(String[] args) {
        R137AccessModifier student = new R137AccessModifier("John","Miami","Syntax",9);
        student.displayDetails();
    }
}

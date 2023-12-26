package org.HomeWork;

public class R118Method {
    /*
    Write a method header on line two with the following specs:    
Returns:
a String
Name:
spaceOut
Parameters:
a String
Then complete the method by programming the following behavior
Insert spaces after every character in the String s, then return the new string.
See below examples (note the space at the end as well).
Examples:
spaceOut("hello") ==> "h e l l o "
spaceOut("technology") ==> "t e c h n o l o g y "
     */
    static String spaceOut(String s) {
        String addSpace = "";
        for (int i = 0; i < s.length(); i++) {
            addSpace = addSpace + s.charAt(i) + " ";
        }
        return addSpace;
    }


    public static void main(String[] args) {
        System.out.println(spaceOut("Hello"));
    }
}

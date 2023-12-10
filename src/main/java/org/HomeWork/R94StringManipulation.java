package org.HomeWork;

public class R94StringManipulation {
    /*
    Create a String given="I love Java classes at Syntax"
- Retrieve 2 Strings using substring method from given String and print them
**Expected Output:**
classes at Syntax
I love Java
     */
    public static void main(String[] args) {
        String given = "I love Java classes at Syntax";
        int index1 = given.indexOf("classes");
        int index2 = given.indexOf("I");
        int lastIndex = given.lastIndexOf("Java")+"Java".length();

        System.out.println(given.substring(index1,given.length()));
        System.out.println(given.substring(index2,lastIndex));
    }
}

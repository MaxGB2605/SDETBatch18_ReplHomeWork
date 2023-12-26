package org.HomeWork;

public class R98StringManipulation {
    /*
    Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
**Expected Output:**
Welcome Syntax family
     */
    public static void main(String[] args) {
        String given="Hello Syntax friends";
        String replace = given.replace("Hello","Welcome").replace("friends","family");
        System.out.println(replace);
    }
}

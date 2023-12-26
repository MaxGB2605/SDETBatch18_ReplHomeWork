package org.HomeWork;

public class R123Variables {
    /*
    Declare the **instance** variables to hold:
- integer values
- String values
- double values
- boolean values
- float values
Access instance variables and then print them all without assigning any values to them.
Print variables one by one the same sequence that you declare them.
**Expected Output:**
0
null
0.0
false
0.0
     */
    int numInt;
    String strString;
    double numDouble;
    boolean aBoolean;
    float numFloat;


    public static void main(String[] args) {
        R123Variables n = new R123Variables();
        System.out.println(n.numInt);
        System.out.println(n.strString);
        System.out.println(n.numDouble);
        System.out.println(n.aBoolean);
        System.out.println(n.numFloat);
    }
}

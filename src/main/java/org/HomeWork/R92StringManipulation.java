package org.HomeWork;

public class R92StringManipulation {
    /*
    Validate if the string ends with "u" prints the boolean value accordingly.
Validate if the string ends with "world" prints the boolean value accordingly.
Validate if the string ends with "are" prints the boolean value accordingly.
Validate if the string ends with "you" prints the boolean value accordingly.
     */
    public static void main(String[] args) {
        String str = "hello how are you";
        System.out.println(str.toLowerCase().endsWith("u"));
        System.out.println(str.toLowerCase().endsWith("world"));
        System.out.println(str.toLowerCase().endsWith("are"));
        System.out.println(str.toLowerCase().endsWith("you"));
    }
}

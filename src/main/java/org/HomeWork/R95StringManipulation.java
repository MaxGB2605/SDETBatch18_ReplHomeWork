package org.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class R95StringManipulation {
    /*
    Using Scanner class input string value.
Print out the following: "The first 3 letters of \_\_\_ is ___"
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
     */
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String word = newScanner.nextLine();
        word=word.substring(0,3);
        System.out.println("The first 3 letters of banana is "+word);
    }
}

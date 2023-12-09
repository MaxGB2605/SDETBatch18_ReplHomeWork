package org.HomeWork;

import java.util.Scanner;

public class R24 {
    /*

Write a program that takes a user's name and prints it.
**Example Output:**
```
Hello, please enter your name
```
Your name is Sumair
     */
    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String name = newScanner.nextLine();
        System.out.println("Your name is "+name);
    }
}

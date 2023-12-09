package org.HomeWork;

import java.util.Scanner;

public class R25SwitchCase {
    /*
      The variable "num" holds an integer input from a user
Write a conditional statement starting on line 9 that does the following:
- If num is positive, print "__ is positive"
- If num is negative, print "__ is negative"
- If num is equals to 0, then print "Entered number is equals to 0"
Examples:
```
In: 5
5 is positive
```
In: -2
-2 is negative
```
In: 0
```
Entered number is equals to 0
     */

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Input number 5,-2,0");
        int num = newScanner.nextInt();


        switch (num){
            case 5:
                System.out.println("In: "+num);
                System.out.println(num+" is positive");
                break;
            case -2:
                System.out.println("In: "+num);
                System.out.println(num+" is negative");
                break;
            case 0:
                System.out.println("In: "+num);
                System.out.println("Entered number is equals to 0");
                break;
            default:

        }

    }
}

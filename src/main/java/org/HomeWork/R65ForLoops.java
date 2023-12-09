package org.HomeWork;

import java.util.Scanner;

public class R65ForLoops {
    public static void main(String[] args) {
        /*
        int x;
Write a for loop that will print out a series of numbers
starting at one less than x and ending at 0.
Sample input/outputs:
```
In: 7
6 5 4 3 2 1 0
         */
        Scanner newScanner = new Scanner(System.in);
        int input = newScanner.nextInt();
        for (int x = input-1; x>=0;x--){
            System.out.println(x);
        }
    }
}

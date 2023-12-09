package org.HomeWork;

import java.util.Scanner;

public class R63ForLoops {
    /*Given the following inputs:
int x;
```
Write a for loop that will print out a series of numbers
starting at 0 and ending at the x(value must be taken from a user), exclusive.
**Example Output:**
In: 3
```
0 1 2
```
In: 8
```
0 1 2 3 4 5 6 7
```
In: 5
```
0 1 2 3 4
     */
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int x = newScanner.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print(i+" ");
        }
    }
}

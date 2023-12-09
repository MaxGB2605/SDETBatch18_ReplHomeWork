package org.HomeWork;

import java.util.Scanner;

public class R78Array {
    public static void main(String[] args) {
        /*
        Create an int array of integers with a size of 5 and input values with Scanner.
Don't print prompt questions for a user.
Using loop print out each element of the array that should look like the output below
**Example:**
Input:
1
2
3
4
5
Output:
10
20
30
40
50
         */

        Scanner newScanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int x = 0; x < array.length; x++) {
            array[x] = newScanner.nextInt();
        }
        int multiplication = 0;
        for (int y = 0; y <= array.length - 1; y++) {
            multiplication = array[y] * 10;
            System.out.println(multiplication);
        }
    }
}

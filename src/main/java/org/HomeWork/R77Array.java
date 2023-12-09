package org.HomeWork;

import java.util.Scanner;

public class R77Array {
    /*
    Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order.
**Example:**
Input:
1
2
3
4
5
Output:
5
4
3
2
1
     */
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int x = 0; x < array.length; x++) {
            array[x] = newScanner.nextInt();
        }
        for (int y = array.length - 1; y >= 0; y--) {
            System.out.println(array[y]);
        }
    }
}

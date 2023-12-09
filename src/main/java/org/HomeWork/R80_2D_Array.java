package org.HomeWork;
/*
Write a program to double the values of every element in the array and print it out.
2.8 4.0 6.6 4.0
8.0 3.0 12.2 2.0
2.4 6.2 8.0 3.2
 */

public class R80_2D_Array {
    public static void main(String[] args) {
        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] * 2;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

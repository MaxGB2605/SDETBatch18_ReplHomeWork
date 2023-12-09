package org.HomeWork;

public class R82_2D_Array {
    public static void main(String[] args) {
        /*
        Write a program that will print the sum of all elements in 2D array.
         */
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };

int sum=0;
        for (int column = 0; column < a.length; column++) {
            for (int row = 0; row < a[column].length; row++) {
                 sum=sum+a[column][row];

            }
        }
        System.out.println(sum);
    }
}

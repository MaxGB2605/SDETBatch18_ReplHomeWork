package org.HomeWork;

public class R85_2D_Array {
    /*
Write a program that sums all numbers that are on even index and on even row.
     */
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int sumEvenIndexRow = 0;

        for (int i = 0; i < a.length; i =i+ 2) {
            for (int j = 0; j < a[i].length; j =j+ 2) {
                sumEvenIndexRow += a[i][j];
            }
        }

        System.out.println(sumEvenIndexRow);
    }
}

package org.HomeWork;

public class R79_2D_Array {
    /*
    Write a program to print values from a 2D array
**Example Output:**
1.4 2.0 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6
     */
    public static void main(String[] args) {
        double [][] numbers = {
                {1.4, 2, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++){
                System.out.print(numbers[row][column]+" ");
            }
            System.out.println();
        }
    }
}

package org.HomeWork;

/*
Write a program that prints the highest value in the array.
**Expected Output:**
input [5,4,8]
 */
public class R81_2D_Array {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 8};
        int highestValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highestValue) {
                highestValue = numbers[i];
            }
        }
        System.out.println(highestValue);
    }
}

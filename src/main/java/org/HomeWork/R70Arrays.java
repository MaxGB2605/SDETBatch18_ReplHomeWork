package org.HomeWork;

public class R70Arrays {
    /*
    Write a program that creates an array of integers
    and stores the following values: 45, 78, 12,  67, 55
    and then prints all array values.
**Output:**
45 78 12 67 55
     */
    public static void main(String[] args) {
        int [] numbers = {45,78,12,67,55};
        for (int x = 0; x<numbers.length; x++) {
            System.out.print(numbers[x]+" ");
        }
    }
}

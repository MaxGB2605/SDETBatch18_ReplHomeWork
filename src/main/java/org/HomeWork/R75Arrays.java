package org.HomeWork;

public class R75Arrays {
    /*
    Using the following array.
{45, 78, 12,  67, 55, 89, 23, 77, 88}
Create a for loop to extract values from that array so your
output looks as below:
**Expected Output:**
78 55 77
Note: Find out what is the start point an how much
you need to increment to get the result.
     */
    public static void main(String[] args) {
        int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};
        for (int x = 1; x < numbers.length; x = x + 3) {
            System.out.print(numbers[x]+" ");
        }
    }
}

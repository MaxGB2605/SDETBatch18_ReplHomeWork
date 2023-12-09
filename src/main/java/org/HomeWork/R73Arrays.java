package org.HomeWork;

public class R73Arrays {
    /*
    Write a program that creates an array of strings with the
     following values{"This", "is", "array", "of", "strings"}
     and prints all values in one line.
**Output:**
This is array of strings
     */
    public static void main(String[] args) {
        String[] values = {"This", "is", "array", "of", "strings"};
        for (int x = 0; x < values.length; x++) {
            System.out.print(values[x] + " ");
        }
    }
}

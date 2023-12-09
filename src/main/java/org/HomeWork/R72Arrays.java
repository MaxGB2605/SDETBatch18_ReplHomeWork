package org.HomeWork;

public class R72Arrays {
    /*
    Write a program that creates an array with the following
values{s, a, y,  b, n, c, t,  d, a, e, x}
Print the values so the output should look like below
**Output:**
syntax
     */
    public static void main(String[] args) {
        char [] letters = {'s','a','y','b','n','c','t','d','a','e','x'};
        for (int x = 0; x<letters.length;x=x+2){
            System.out.print(letters[x]);
        }
    }
}

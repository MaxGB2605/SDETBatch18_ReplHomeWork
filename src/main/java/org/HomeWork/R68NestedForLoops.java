package org.HomeWork;

public class R68NestedForLoops {
    /*
    Write a program to print out the pattern:
 **Expected output:**
 1 2 3 4 5
 1 2 3 4 5
     */
    public static void main(String[] args) {
        for (int x = 1;x<=2;x++){
            for (int i=0;i<5;i++){
                int c = 1+i;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

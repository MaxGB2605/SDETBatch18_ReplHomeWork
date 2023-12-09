package org.HomeWork;

public class R69NestedForLoops {
    /*
    Write a program to print out the pattern:
**Expected output:**
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
     */
    public static void main(String[] args) {
        for (int x = 7; x >=1;x--){
            for (int i=1;i<=x;i++){
                int c=0+i;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

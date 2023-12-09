package org.HomeWork;

public class R62ForLoops {
    public static void main(String[] args) {
        /*
        Using for loop Print 1 to 10 Numbers except 5 and 6
         */
        for (int x = 1; x <= 10; x++){
            if (!(x==5) && !(x==6)){
                System.out.println(x);
            }
        }
    }
}

package org.HomeWork;

import java.util.Scanner;

public class R25SwitchFromTeacher {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();

        switch (num){
            case 5:
                System.out.println(num+" is positive");
                break;
            case -2:
                System.out.println(num+" is negative");
                break;
            case 0:
                System.out.println("Entered number is equals to 0");
                break;
            default:
        }
    }
}

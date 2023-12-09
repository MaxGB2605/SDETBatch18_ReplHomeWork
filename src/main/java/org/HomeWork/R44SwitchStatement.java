package org.HomeWork;

import java.util.Scanner;

public class R44SwitchStatement {
    /*
    Prompt user with questions: "Please enter your favorite car make"
- if user enters  BMW -->  carOrigin = "german car"
- if user enters  Toyota -->  carOrigin = " japanese car"
- if user enters  Maserati -->  carOrigin = "italian car"
- anything else besides those values --> carOrigin = "unknown"
```
The output of your program should be:
```
"Your favorite car is ___"
     */
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String car = newScanner.nextLine();

        String carOrigin = "unknown";
        switch (car.toLowerCase()){
            case "bmw":
                carOrigin = "german car";
                break;
            case "toyota":
                carOrigin = "japanese car";
                break;
            case "maserati":
                carOrigin = "italian car";
                break;
            default:
                carOrigin = "unknown";
        }
        System.out.println("Your favorite car is "+carOrigin);
    }
}

package org.HomeWork;

import java.util.Scanner;

public class R22 {
    /*
    First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"
**Example Output:**
```Enter your name
```Enter your mobile number
```
Enter your age
```
Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
     */

    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = newScanner.nextLine();
        System.out.println("Enter your mobile number");
        String mobileNumber = newScanner.nextLine();
        System.out.println("Enter your age");
        int age = newScanner.nextInt();

        System.out.println("Your name is "+name+", your name is "+age+" and your mobile number is "+mobileNumber);

    }
}

package org.HomeWork;

import java.util.Scanner;

public class R37LogicalOperator {
    /*
    Take 2 boolean inputs from a user:
"Are you thirsty?"
"Are you sleepy?"
If user is thirsty and not sleepy--> drink=water
If user is thirsty and sleepy--> drink=coffee
If user is not thirsty and sleepy --> drink=tea
Otherwise drink="nothing"
```
Output:
```
- Looks like you need to drink \_\_\_
     */
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        boolean thirsty, sleepy;
        System.out.println("Are you thirsty?");
        thirsty = newScanner.nextBoolean();
        System.out.println("Are you sleepy?");
        sleepy = newScanner.nextBoolean();

        
        if ((thirsty == true) && (!sleepy == true)){
            System.out.println("Looks like you need to drink water");
        } else if ((thirsty == true) && (sleepy == true)){
            System.out.println("Looks like you need to drink coffee");
        }else if ((!thirsty == true) && (sleepy == true)) {
            System.out.println("Looks like you need to drink tea");
        }else {
            System.out.println("Looks like you need to drink nothing");
        }
    }
}

package org.HomeWork;

import java.util.Scanner;

public class R38LogicalOperators {
    /*

Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
**Output**:
```
Today you will be learning ____
```
     */

        public static void main(String[] args) {
            Scanner newScanner = new Scanner(System.in);
            System.out.println("Is it weekend?");
            boolean isWeekend = newScanner.nextBoolean();

            String subject;
            if (!isWeekend){
                subject = "manual testing";
            }else {
                subject = "java";
            }
            System.out.println("Today you will be learning "+subject);
        }
    }

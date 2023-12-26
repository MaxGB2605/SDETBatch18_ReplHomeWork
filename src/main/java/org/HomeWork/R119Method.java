package org.HomeWork;

public class R119Method {
    /*
    Write a method header with the following specs:
Returns:
a String
Name:
censorLetter
Parameters:
a String
a char
Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.
Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */
    static String censorLetter(String a,char b){
        String censored = a.replace(b,'*');
        return censored;
    }

    public static void main(String[] args) {
        System.out.println(censorLetter("treat or treak",'t'));
    }
}

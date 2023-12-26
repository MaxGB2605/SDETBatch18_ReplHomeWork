package org.HomeWork;

public class R134StaticKeywordCountVowels {
    /*
    Write a method with the following specs:
Returns:
an integer
Name:
countVowels
Parameters:
a String called s
Purpose:
count the number of vowels in the string s.  Assume s is all lowercase.
Examples:
countVowels("obama") ==> 3
countVowels("happy friday! i love weekends") ==> 9
     */
    public static int countVowels(String s) {
        s=s.replaceAll("[^aeuio]","");
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(countVowels("happy "));
    }
}

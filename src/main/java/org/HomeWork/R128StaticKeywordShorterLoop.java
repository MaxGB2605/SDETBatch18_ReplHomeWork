package org.HomeWork;

public class R128StaticKeywordShorterLoop {
    static String mixString(String s1, String s2) {
        String combined = "";
        for (int i = 0; i < s1.length(); i++) {
            combined += s1.charAt(i);
            combined += s2.charAt(i);
        }
        return combined;
    }


    //test case below (dont change):
    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);

    }
}


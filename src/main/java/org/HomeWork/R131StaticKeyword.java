package org.HomeWork;

public class R131StaticKeyword {
    static String thirdLetter(String s1) {
String str="";
        for (int i = 0; i < s1.length(); i=i+3) {
            str+=s1.charAt(i);
        }
return str;

    }
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }

}

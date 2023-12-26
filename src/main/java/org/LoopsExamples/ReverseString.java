package org.LoopsExamples;

public class ReverseString {
    public static void main(String[] args) {
        String originalStr = "Lolipop";
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);

        String str = "reverse";
        String rev = "";
        for (int i = str.length()-1; i >=0; i--) {
            rev=rev+str.charAt(i);

        }
        System.out.println(str+" : "+rev);
    }

}


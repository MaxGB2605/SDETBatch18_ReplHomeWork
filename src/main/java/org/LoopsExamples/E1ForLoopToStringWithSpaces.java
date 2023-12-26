package org.LoopsExamples;

public class E1ForLoopToStringWithSpaces {
    public static void main(String[] args) {
        String a="Maxim Brazhko";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("-----------------");
for (char b:a.toCharArray()){

    System.out.print(b+",");
}
    }
}

package org.HomeWork;

import java.util.Arrays;

public class R132StaticKeywordArrayEnhancedLoop {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);
        Arrays.stream(a).forEach(arr -> {
            for (int number : arr) {
                System.out.print(number + " ");
            }
            System.out.println();
        });
    }
    //create method reduce10 here
    static int[][] reduce10(int [][] array){

        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=array[i][j]-10;

            }
        }
        return array;

    }

}



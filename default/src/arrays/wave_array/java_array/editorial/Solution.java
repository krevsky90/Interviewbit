package arrays.wave_array.java_array.editorial;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4,5};
        int[] result =wave(A);
        System.out.println("");
    }


    public static int[] wave(int[] A) {

        Arrays.sort(A);
        for(int i=0;i<A.length-1;i=i+2){
            int temp =A[i];
            A[i]=A[i+1];
            A[i+1]=temp;
        }
        return A;
    }
}

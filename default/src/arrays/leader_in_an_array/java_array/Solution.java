package arrays.leader_in_an_array.java_array;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        int[] result = solve(arr);
        System.out.println("");
    }

    public static int[] solve(int[] A) {
        int n=A.length;
        int[] rightmax=new int[n];
        rightmax[n-1]=A[n-1];

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(A[n-1]);
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],A[i]);
            if(rightmax[i]==A[i]){
                arr.add(A[i]);
            }
        }
        int[] ret=new int[arr.size()];
        for(int i=0;i<ret.length;i++){
            ret[i]=arr.get(i);
        }
        return ret;

    }
}

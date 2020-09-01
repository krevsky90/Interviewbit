package arrays.kth_row_of_pascals_triangle.java.editorial;

import java.util.ArrayList;

/**
 * The idea is C(k,n) = C(k-1,n) * (n - k + 1) / k
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> result = getRow(6);
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> getRow(int a) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(1);
        for(int i=1; i<=a; i++){
            int num = (a+1-i)*res.get(i-1)/i;
            res.add(num);
        }
        return res;
    }
}
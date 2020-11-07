package arrays.perfect_peak_of_array.java.editorial;

import java.util.Arrays;
import java.util.List;

/**
 * O(n) solution
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 4, 3, 6, 8, 10, 7, 9);
        int result = perfectPeak(list);
        System.out.println(result);
    }
    //A = [5 1 4 3 6 8 10 7 9]
    public static  int perfectPeak(List<Integer> A) {
        int len = A.size();
        int max[] = new int[len];
        int min[] = new int[len];
        max[0] = A.get(0);
        min[len - 1] = A.get(len - 1);

        for (int i = 1; i < len; i++) {
            max[i] = Math.max(max[i - 1], A.get(i));
        }
        //max = [5 5 5 5 6 8 10 10 10]

        for (int i = len - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], A.get(i));
        }
        //min = [1 1 3 3 6 7 7 7 9]

        for (int i = 1; i < len - 1; i++) {
            if (A.get(i) > max[i - 1] && A.get(i) < min[i + 1]) {
                //element - 6
                return 1;
            }
        }

        return 0;
    }
}
package bit_manipulation.min_xor_value.java.editorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(14, 12, 5, 8, 11, 4);
        int result = findMinXor(list);
        System.out.println(result);
    }

    public static int findMinXor(List<Integer> A) {
        Collections.sort(A);

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < A.size() - 1; i++) {
            result = Math.min(result, A.get(i) ^ A.get(i+1));
        }

        return result;
    }
}
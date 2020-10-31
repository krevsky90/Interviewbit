package bit_manipulation.single_number.java.editorial;

import java.util.Arrays;
import java.util.List;

/**
 * Explanation:
 * 0^x = x
 * x^x = 0
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 1);
        int result = singleNumber(list);
        System.out.println(result);
    }

    // DO NOT MODIFY THE LIST
    public static int singleNumber(final List<Integer> a) {
        long xor_sum = 0;
        for (int a_i : a) {
            System.out.println("before: a_i = " + a_i + ", xor_sum = " + xor_sum);
            xor_sum = xor_sum ^ a_i;
            System.out.println("after xor_sum = " + xor_sum);
        }

        return (int) xor_sum;
    }
}

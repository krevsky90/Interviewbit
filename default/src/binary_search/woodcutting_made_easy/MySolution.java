package binary_search.woodcutting_made_easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * without usage of Binary search of height
 */
public class MySolution {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(117, 84, 50, 119, 74, 128);
        int result = solve(A, 58);
        System.out.println(result);
    }

    public static int solve(List<Integer> A, int B) {
        Collections.sort(A);
        long sum = 0;
        for (Integer i : A) {
            sum += i;
        }

        long delta = sum - B * 1L;
        int N = A.size();
        int index = 0;
        while (N > 0) {
            if (index == 0) {
                delta -= N * A.get(index);
            } else {
                delta -= N * (A.get(index) - A.get(index-1));
            }
            if (delta == 0) {
                return A.get(index);
            } else if (delta < 0) {
                break;
            } else {
                index++;
                N--;
            }
        }

        if (index == 0) {
            return (int) ((sum - B * 1L) / N);
        } else {
            return (int) ((delta + N * A.get(index)) / N);
        }
    }
}

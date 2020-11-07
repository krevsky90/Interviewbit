package arrays.perfect_peak_of_array;

import java.util.Arrays;
import java.util.List;

/**
 * considered as part-solution due to bad performance O(n^2)
 */
public class MySolution {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5706, 26963, 24465, 29359, 16828, 26501, 28146, 18468, 9962, 2996, 492, 11479, 23282, 19170, 15725, 6335);
        int result = perfectPeak(list);
        System.out.println(result);
    }

    public static int perfectPeak(List<Integer> A) {
        int localMax = A.get(0);

        for (int i = 1; i < A.size(); i++) {
            while ((i < A.size() - 1) && A.get(i) < localMax) {
                i++;
            }

            if (i == A.size() - 1) {
                return 0;
            }

            localMax = A.get(i);
            // resultIndex = i;

            //check A.get(i) < each of right element
            boolean greaterOk = true;
            for (int j = i + 1; j < A.size(); j++) {
                if (localMax >= A.get(j)) {
                    greaterOk = false;
                    break;
                }
            }

            if (greaterOk) {
                return 1;
            }
        }

        return 0;
    }
}

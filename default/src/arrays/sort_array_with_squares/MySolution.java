package arrays.sort_array_with_squares;

/**
 * It is NOT NECESSARY to create new minusArr array. just to find minus_is value and use only A array
 */
public class MySolution {
    public static void main(String[] args) {
        int[] A = new int[]{-6, -3, -1, 2, 4, 5};
        int[] result = solve(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] solve(int[] A) {
        int len = A.length;
        int[] minusArr = new int[len];
        int i = 0;
        while (A[i] < 0) {
            minusArr[i] = A[i];
            i++;
        }

        int minus_i = i - 1;
        int[] result = new int[len];
        int res_i = 0;
        while (minus_i >= 0 && i < len) {
            if (Math.abs(minusArr[minus_i]) < A[i]) {
                result[res_i] = minusArr[minus_i] * minusArr[minus_i];
                res_i++;
                minus_i--;
            } else {
                result[res_i] = A[i] * A[i];
                res_i++;
                i++;
            }
        }

//        if (minus_i < 0) {
            //copy rest square of elements from A to result
            while (i < len) {
                result[res_i] = A[i] * A[i];
                res_i++;
                i++;
            }
//        }

//        if (i >= len) {
            //copy rest square of elements from minusArr to result
            while (minus_i >= 0) {
                result[res_i] = minusArr[minus_i] * minusArr[minus_i];
                res_i++;
                minus_i--;
            }
//        }

        return result;
    }
}

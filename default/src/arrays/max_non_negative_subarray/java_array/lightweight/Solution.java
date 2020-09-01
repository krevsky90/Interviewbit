package arrays.max_non_negative_subarray.java_array.lightweight;

public class Solution {
    public int[] maxset(int[] A) {

        long sum = 0;
        long max_sum = 0;
        int i = 0;
        int s = 0;
        int e = 0;
        int max_start = 0;
        int max_end = 0;
        boolean flag = false;

        for (int k = 0; k < A.length; k++) {
            if (A[k] >= 0) {
                flag = true;
                break;
            }
        }

        if (flag) {
            while (i < A.length) {

                while (i < A.length && A[i] >= 0) {
                    sum = sum + A[i];
                    e = i;
                    i++;
                }

                if (sum > max_sum) {
                    max_sum = sum;
                    max_start = s;
                    max_end = e;
                } else if (sum == max_sum && max_end - max_start < e - s) {
                    max_end = e;
                    max_start = s;
                }

                while (i < A.length && A[i] < 0)
                    i++;


                //i++;
                s = i;
                sum = 0;
            }

            int[] subArray = new int[max_end - max_start + 1];
            //int max_indices=max_end-max_start+1;
            for (int j = 0; j < subArray.length; j++) {
                subArray[j] = A[max_start + j];
            }
            return subArray;
        } else {
            int[] subArray = new int[0];
            return subArray;
        }


    }
}

package arrays.max_non_negative_subarray;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//todo: replace BigInteger with long
public class MySolution {
    public static int[] maxset(int[] A) {
        List<BigInteger> arrResult = new ArrayList<>();
        int startResult = 0;
        BigInteger sumResult = BigInteger.ZERO;

        int i = 0;
        while (i < A.length) {
            //todo: works but strange construction (I mean to double-check i < A.length)
            while (i < A.length && A[i] < 0) {
                i++;
            }

            int start = i;
            BigInteger tempSum = BigInteger.ZERO;
            List<BigInteger> tempResult = new ArrayList<>();
            int j = 0;
            while ((start + j) < A.length && A[start + j] >= 0) {
                tempResult.add(BigInteger.valueOf(A[start + j]));
                tempSum = tempSum.add(tempResult.get(j));
                j++;
            }

            if (tempSum.compareTo(sumResult) > 0) {
                arrResult = tempResult;
                sumResult = tempSum;
                startResult = start;
            } else if (tempSum.equals(sumResult)) {
                if (tempResult.size() > arrResult.size()) {
                    arrResult = tempResult;
                    sumResult = tempSum;
                    startResult = start;
                } else if (tempResult.size() == arrResult.size()) {
                    if (start < startResult) {
                        arrResult = tempResult;
                        sumResult = tempSum;
                        startResult = start;
                    }
                }
            }

            i += tempResult.size();
        }

        int[] res = new int[arrResult.size()];
        for (int r = 0; r < res.length; r++) {
            res[r] = arrResult.get(r).intValue();
        }

        return res;
    }
}

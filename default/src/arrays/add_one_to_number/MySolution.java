package arrays.add_one_to_number;

public class MySolution {
    public int[] plusOne(int[] A) {
        int[] resultInverted = new int[A.length + 1];
        int startIndexToCopyRest = -1;
        int j = A.length - 1;
        while (true) {
            if (j == -1) {
                resultInverted[A.length - 1 - j] = 1;
                break;
            }
            int temp = A[j];
            int tempnew = A[j] + 1;
            if (tempnew == 10) {
                resultInverted[A.length - 1 - j] = 0;
                j--;
            } else {
                resultInverted[A.length - 1 - j] = tempnew;
                j--;
                startIndexToCopyRest = j;
                break;
            }
        }

        int i = startIndexToCopyRest;
        while (i >= 0) {
            resultInverted[A.length - 1 - i] = A[i];
            i--;
        }

        //find first non-zero element from rigth side
        i = resultInverted.length - 1;
        while (resultInverted[i] == 0) {
            i--;
        }

        int bound = i;

        //to invert and remove zeros
        int[] result = new int[bound + 1];
        for (int i2 = 0; i2 < bound + 1; i2++) {
            result[i2] = resultInverted[bound - i2];
        }

        return result;
    }
}

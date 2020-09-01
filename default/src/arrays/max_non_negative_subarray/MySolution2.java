package arrays.max_non_negative_subarray;

public class MySolution2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, -7, 2, 3};
        int[] res = maxset(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] maxset(int[] arr) {
        int lengthmax = 0;
        int startmax = 0;
        long summax = 0;

        int lengthtemp = 0;
        int starttemp = 0;
        long sumtemp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                lengthtemp = 0;
                starttemp = i+1;
                sumtemp = 0;
            } else {
                sumtemp += arr[i];
                lengthtemp++;
            }

            //we can check and update arrmax and summax every iteration
            if (sumtemp > summax
                    || (sumtemp == summax &&  lengthtemp > lengthmax)
                    || (sumtemp == summax && lengthtemp == lengthmax && starttemp < startmax)
            ) {
                lengthmax = lengthtemp;
                startmax = starttemp;
                summax = sumtemp;

            }
        }

        int[] result = new int[lengthmax];
        for (int j = 0; j < lengthmax; j++) {
            result[j] = arr[startmax + j];
        }

        return result;
    }
}

package arrays.first_missing_integer.java.fastest;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4,-1,6,8));
        int res = firstMissingPositive(arr);
        System.out.println("ans = " + res);
    }

    public static int firstMissingPositive(ArrayList<Integer> A) {
        int len = A.size();
        for (int i = 0; i < len; i++) {
            while (A.get(i) != (i + 1) || A.get(i) <= 0) {
                int num = A.get(i);
                int targetIndex = num - 1;
                if ((targetIndex < 0 || targetIndex >= len) || num == A.get(num - 1)) {
                    break;
                }

                A.set(i, A.get(targetIndex));
                A.set(targetIndex, A.get(i));
            }

            System.out.println(i);
            printList(A);


        }
        // find the missing integer
        for (int i = 0; i < len; i++) {
            if (A.get(i) != i + 1) {
                // found missing
                return i + 1;
            }
        }
        // no missing number
        return len + 1;
    }

    private static void printList(ArrayList<Integer> list) {
        StringBuffer sb = new StringBuffer();
        for (Integer i : list) {
            sb.append(i + " ");
        }

        System.out.println(sb.toString());
    }
}

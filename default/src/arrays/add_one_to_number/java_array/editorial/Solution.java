package arrays.add_one_to_number.java_array.editorial;

public class Solution {
    public static void main(String[] args) {
        int[] A = new int[]{0, 0, 1, 9};
        plusOne(A);
    }

    public static int[] plusOne(int[] A) {
        int carry = 1;

        for (int i = A.length - 1; i >= 0; i--) {
            int sum = A[i] + carry;
            A[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int b[] = new int[A.length + 1];
            b[0] = carry;
            for (int i = 1; i < A.length + 1; i++) {
                b[i] = A[i - 1];
            }

            return b;
        } else {
            int p = 0;
            while (A[p] == 0) {
                p++;
            }
            int b[] = new int[A.length - p];

            for (int i = p; i < A.length; i++) {
                b[i - p] = A[i];
            }

            return b;
        }
    }
}
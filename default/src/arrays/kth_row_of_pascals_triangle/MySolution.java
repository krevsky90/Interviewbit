package arrays.kth_row_of_pascals_triangle;

public class MySolution {
    public static void main(String[] args) {
        int[] result = getRow(6);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] getRow(int A) {
        int[] result = new int[A + 1];
        result[0] = 1;
        if (A == 0) {
            return result;
        }

        int[] prev = getRow(A - 1);
        for (int i = 0; i < A - 1; i++) {
            result[i + 1] = prev[i] + prev[i + 1];
        }
        result[A] = 1;

        return result;
    }
}

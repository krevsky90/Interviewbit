package arrays.pascal_triangle;

/**
 * Don't know why, but interviewbit doesn't accept this solution because (no idea why) it returns
 * [1 ] [1 ] [1 ] [1 ] [1 ] instead of [1 ] [1 1 ] [1 2 1 ] [1 3 3 1 ] [1 4 6 4 1 ]
 *
 * NOTE: also interviewbit doesn't accept the solutions that are in 'Complete Solution' section!
 */
public class MySolution {
    public static void main(String[] args) {
        int[][] result = solve(5);

        for (int i = 0; i < result.length; i++) {
            String s = "";
            int j = 0;
            while(j < result[i].length) {
                s += result[i][j] + " ";
                j++;
            }

            System.out.println(s);
        }
    }
    public static int[][] solve(int A) {
        int[][] result = new int[A][];
        for (int i = 0; i < A; i++) {
            int[] tempRow = new int[i+1];
            //fill i-th row
            tempRow[0] = 1;
            for (int j = 1; j < i+1; j++) {
                tempRow[j] = tempRow[j-1]*(i-j+1)/j;
            }

            result[i] = tempRow;
        }

        return result;
    }
}

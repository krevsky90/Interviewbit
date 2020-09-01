package arrays.spiral_order_matrix_i;

public class MySolution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        int rows = A.length;
        if (rows == 0) {
            return new int[0];
        }

        int columns = A[0].length;
        int[] result = new int[rows * columns];

        int row_start = 0;
        int row_end = rows - 1;
        int column_start = 0;
        int column_end = columns - 1;
        int counter = 0;
        boolean canMove = false;
        while (row_start <= row_end && column_start <= column_end) {
            //go from left to right
            for (int i1 = column_start; i1 <= column_end; i1++) {
                result[counter] = A[row_start][i1];
                counter++;
                canMove = true;
            }

            if (!canMove) {
                break;
            }
            canMove = false;

            row_start++;

            //go from top to bottom
            for (int i2 = row_start; i2 <= row_end; i2++) {
                result[counter] = A[i2][column_end];
                counter++;
                canMove = true;
            }

            if (!canMove) {
                break;
            }
            canMove = false;

            column_end--;

            //go from right to left
            for (int i3 = column_end; i3 >= column_start; i3--) {
                result[counter] = A[row_end][i3];
                counter++;
                canMove = true;
            }

            if (!canMove) {
                break;
            }
            canMove = false;

            row_end--;

            //go from bottom to top
            for (int i4 = row_end; i4 >= row_start; i4--) {
                result[counter] = A[i4][column_start];
                counter++;
                canMove = true;
            }

            if (!canMove) {
                break;
            }
            canMove = false;

            column_start++;
        }

        return result;
    }
}


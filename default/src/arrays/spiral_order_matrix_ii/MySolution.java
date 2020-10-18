package arrays.spiral_order_matrix_ii;

import java.util.ArrayList;

/**
 * Like java.editorial
 */
public class MySolution {
    public static void main(String[] args) {
        int A = 5;
        ArrayList<ArrayList<Integer>> res = generateMatrix(A);
        for (ArrayList<Integer> list : res) {
            String s = "";
            for (Integer i : list) {
                s += i + "\t";
            }

            System.out.println(s);
        }
    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(A);
        //initialization by 0
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> tempList = new ArrayList<Integer>(A);
            for (int j = 0; j < A; j++) {
                tempList.add(0);
            }
            res.add(tempList);
        }

        int rowMin = 0;
        int rowMax = A - 1;
        int columnMin = 0;
        int columnMax = A - 1;

        int direction = 1; //1 - right, 2 - down, 3 - left, 4 - up
        int a = 1;
        while (a <= A * A) {
            if (direction == 1) {
                for (int column = columnMin; column <= columnMax; column++) {
                    res.get(rowMin).set(column, a);
                    a++;
                }

                rowMin++;
                direction = 2;
            } else if (direction == 2) {
                for (int row = rowMin; row <= rowMax; row++) {
                    res.get(row).set(columnMax, a);
                    a++;
                }

                columnMax--;
                direction = 3;
            } else if (direction == 3) {
                for (int column = columnMax; column >= columnMin; column--) {
                    res.get(rowMax).set(column, a);
                    a++;
                }

                rowMax--;
                direction = 4;
            } else if (direction == 4) {
                for (int row = rowMax; row >= rowMin; row--) {
                    res.get(row).set(columnMin, a);
                    a++;
                }

                columnMin++;
                direction = 1;
            }
        }

        return res;
    }
}

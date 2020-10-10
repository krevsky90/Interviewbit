package arrays.anti_diagonals;

import java.util.ArrayList;

public class MySolution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int len = A.size();

        ArrayList<Integer> tempDiag;
        for (int start = 0; start < len; start++) {
            tempDiag = new ArrayList<Integer>(start + 1);
            int i = 0;
            int j = start;
            while (j >= 0) {
                tempDiag.add(A.get(i).get(j));
                i++;
                j--;
            }

            result.add(tempDiag);
        }

        for (int start = 1; start < len; start++) {
            tempDiag = new ArrayList<Integer>(len - start);
            int i = start;
            int j = len - 1;
            while (i < len) {
                tempDiag.add(A.get(i).get(j));
                i++;
                j--;
            }

            result.add(tempDiag);
        }

        return result;
    }
}

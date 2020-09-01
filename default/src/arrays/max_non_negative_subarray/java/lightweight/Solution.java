package arrays.max_non_negative_subarray.java.lightweight;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        if (A == null)
            return null;

        int startSaved = 0, start = 0;
        int lengthSaved = 0, length = 0;
        Double sumSaved = -1.0, sum = 0.0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) < 0) {
                if (sum > sumSaved ||
                        (sum == sumSaved && length > lengthSaved) ||
                        (sum == sumSaved && length == lengthSaved && start < startSaved)) {
                    startSaved = start;
                    lengthSaved = length;
                    sumSaved = sum;
                }
                start = i + 1;
                length = 0;
                sum = 0.0;
                continue;
            }

            length++;
            sum += A.get(i);
        }

        if (sum > sumSaved ||
                (sum == sumSaved && length > lengthSaved) ||
                (sum == sumSaved && length == lengthSaved && start < startSaved)) {
            startSaved = start;
            lengthSaved = length;
            sumSaved = sum;
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < lengthSaved; i++)
            ans.add(A.get(i + startSaved));

        return ans;
    }
}

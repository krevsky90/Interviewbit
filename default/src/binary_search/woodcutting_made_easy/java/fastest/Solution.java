package binary_search.woodcutting_made_easy.java.fastest;

import java.util.ArrayList;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        //sorting not necessary
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i <= A.size() - 1; i++) {
            minHeight = Math.min(minHeight, A.get(i));
            maxHeight = Math.max(maxHeight, A.get(i));
        }

        int l = minHeight;
        int r = maxHeight;
        int ansHeight = 0;

        while (l <= r) {
            int midHeight = l + (r - l) / 2;
            long lengthCut = findLength(midHeight, A);

            if (lengthCut >= B) {
                ansHeight = Math.max(ansHeight, midHeight); //midHeight;
                l = midHeight + 1;
                //increase the height to decrease the subsequent lengthCut
            } else {
                r = midHeight - 1;
                //decrease the height to increase the subsequent lengthCut
            }
        }

        return ansHeight;
    }

    public long findLength(int h, ArrayList<Integer> heights) {
        long totalLength = 0;
        for (int i = 0; i <= heights.size() - 1; i++) {
            if (heights.get(i) > h) {
                totalLength += heights.get(i) - h;
            }
        }

        return totalLength;
    }

}
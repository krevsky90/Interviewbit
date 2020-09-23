package arrays.repeat_and_missing_number_array.java.fastest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * using sum of arithmetic progression
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        double l = A.size();
        double sum = (l * (l + 1)) / 2;
        long sumA = 0;
        int a = 0;
        HashSet<Integer> ASet = new HashSet<Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (ASet.contains(A.get(i))) {
                a = A.get(i);
            }
            ASet.add(A.get(i));
            sumA = sumA + A.get(i);
        }
        double diff = sumA - sum;
        int b = a - (int) diff;
        out.add(a);
        out.add(b);
        return out;
    }
}
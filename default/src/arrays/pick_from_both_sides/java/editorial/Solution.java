package arrays.pick_from_both_sides.java.editorial;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solve(List<Integer> a, int b) {
        int sum = 0;
        if (b >= a.size()) {
            for (int i = 0; i < a.size(); i++)
                sum += a.get(i);
            return sum;
        }
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            sum += a.get(i);
        }
        l.add(sum);
        sum = 0;
        for (int j = a.size() - 1; j > a.size() - b - 1; j--) {
            sum += a.get(j);
        }
        l.add(sum);
        int i = 0;

        while (i < b - 1) {
            sum = 0;
            for (int j = 0; j < b - i - 1; j++) {
                sum += a.get(a.size() - j - 1);
            }

            for (int j = 0; j <= i; j++)
                sum += a.get(j);
            l.add(sum);
            i++;

        }
        for (int j = 0; j < l.size(); j++) {
            if (l.get(j) > max)
                max = l.get(j);
        }
        return max;
    }
}


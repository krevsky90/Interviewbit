package two_pointers.counting_subarrays.java.editorial;

import java.util.ArrayList;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int ans = 0;
        int n = A.size();
        int temp;
        for (int i = 0; i < n - 1; i++) {
            temp = A.get(i);
            if (A.get(i) < B) {
                ans++;
            } else {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                temp += A.get(j);
                if (temp < B) {
                    ans++;
                } else {
                    break;
                }
            }
        }

        return A.get(n - 1) < B ? ans + 1 : ans;
    }
}

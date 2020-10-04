package math.is_rectangle.java.editorial;

import java.util.Arrays;

public class Solution {
    public int solve(int A, int B, int C, int D) {
        int[] arr = {A, B, C, D};
        Arrays.sort(arr);
        return arr[0] == arr[1] && arr[2] == arr[3] ? 1 : 0;
    }
}
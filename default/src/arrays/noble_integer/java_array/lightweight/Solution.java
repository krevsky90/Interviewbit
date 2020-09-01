package arrays.noble_integer.java_array.lightweight;

import java.util.Arrays;

public class Solution {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1])
                continue;
            if (nums[i] == nums.length - (i + 1))
                return 1;
        }

        return -1;

    }
}

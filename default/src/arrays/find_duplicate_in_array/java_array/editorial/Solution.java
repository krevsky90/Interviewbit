package arrays.find_duplicate_in_array.java_array.editorial;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int temp = Math.abs(a[i]);
            int temp2 = a[temp];
            if (temp2 < 0)//if this happens it will mean that a[temp] is already visited
                return temp;//which means that temp is already present in the array
            else
                a[temp] = -a[temp];
        }
        return -1;
    }

}
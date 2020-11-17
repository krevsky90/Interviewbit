package two_pointers.remove_duplicates_from_sorted_array.java.editorial;

import java.util.ArrayList;

public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (!(a.get(i).equals(a.get(j)))) {
                j++;
                a.set(j, a.get(i));
            }
        }
        return j + 1;
    }
}

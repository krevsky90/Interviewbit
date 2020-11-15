package two_pointers.sort_by_color.java.editorial;

import java.util.ArrayList;

public class Solution {
    public void sortColors(ArrayList<Integer> a) {
        int zero = 0, one = 0, index = 0;
        while (index < a.size()) {
            if (a.get(index) == 0) zero++;
            if (a.get(index) == 1) one++;
            index++;
        }
        index = 0;
        while (zero != 0) {
            a.set(index, 0);
            index++;
            zero--;
        }
        while (one != 0) {
            a.set(index, 1);
            index++;
            one--;
        }
        while (index < a.size()) {
            a.set(index, 2);
            index++;
        }
    }
}
package two_pointers.sort_by_color.java.lightweight;

import java.util.ArrayList;

/**
 * like java.editorial
 */
public class Solution {
    public void sortColors(ArrayList<Integer> a) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int n : a) {
            switch (n) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                default:
                    count2++;
            }
        }
        a.clear();
        for (int i = 0; i < count0; i++) a.add(0);
        for (int i = 0; i < count1; i++) a.add(1);
        for (int i = 0; i < count2; i++) a.add(2);
    }
}
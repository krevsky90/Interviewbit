package two_pointers.merge_two_sorted_lists_ii.java.lightweight;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(1, 5, 8));

        ArrayList<Integer> b = new ArrayList<>();
        b.addAll(Arrays.asList(5, 9));

        merge(a, b);

        System.out.println("");
    }
    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                i++;
            } else {
                a.add(i, b.get(j));
                j++;
            }
        }
        while (j < b.size()) {
            a.add(i, b.get(j));
            j++;
        }
    }
}

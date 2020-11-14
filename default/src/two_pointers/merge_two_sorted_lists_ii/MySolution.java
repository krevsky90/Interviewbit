package two_pointers.merge_two_sorted_lists_ii;

import java.util.ArrayList;

/**
 * like java.lightweight but my solution has more additional conditions
 */
public class MySolution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        while (j < b.size() && i < a.size()) {
            if (a.get(i).compareTo(b.get(j)) < 0) {
                i++;
            } else if (a.get(i).compareTo(b.get(j)) == 0) {
                a.add(i + 1, b.get(j));
                i++;
                j++;
            } else {
                a.add(i, b.get(j));
                i++;
                j++;
            }
        }

        for (int j2 = j; j2 < b.size(); j2++) {
            a.add(b.get(j2));
        }
    }
}

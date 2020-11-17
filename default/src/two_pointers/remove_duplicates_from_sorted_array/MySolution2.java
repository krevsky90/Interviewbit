package two_pointers.remove_duplicates_from_sorted_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * with removing of extra elements
 *
 * It seems my problem is to remove not from the end
 * lool at java.fastest as a good example
 */
public class MySolution2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.addAll(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));
        int result = removeDuplicates(A);
        System.out.println(result);
    }

    public static int removeDuplicates(ArrayList<Integer> a) {
        int i = 0;
        int len = a.size();
        if (len <= 1) {
            return len;
        }

        for (int j = 1; j < len; j++) {
            if (!a.get(i).equals(a.get(j))) {
                i = j;
            } else {
                a.set(j, null);
            }
        }

        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                it.remove();
            }
        }

        return a.size();
    }
}

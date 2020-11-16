package two_pointers.remove_element_from_array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * bad solution since there is linear additional space complexity.
 */
public class MySolution {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.addAll(Arrays.asList(4, 1, 1, 2, 1, 3));
        int b = 1;
        int res = removeElement(a, b);
    }

    public static int removeElement(ArrayList<Integer> a, int b) {
        ArrayList<Integer> a2 = new ArrayList<Integer>(a.size());
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).intValue() != b) {
                a2.add(a.get(i));
            }
        }

        a.clear();
        a.addAll(a2);

        return a.size();
    }
}

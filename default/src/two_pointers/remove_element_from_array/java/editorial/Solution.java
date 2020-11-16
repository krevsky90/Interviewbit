package two_pointers.remove_element_from_array.java.editorial;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * It does not matter what is left beyond the expected length!!
 * то есть, пофигу, какие элементы нах-ся в массиве в индексом res+!
 *
 * в данном примере имеем: 4 2 3 2 1 3, res = 3
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.addAll(Arrays.asList(4, 1, 1, 2, 1, 3));
        int b = 1;
        int res = removeElement(a, b);
        System.out.println("");
    }

    public static int removeElement(ArrayList<Integer> a, int b) {
        int n = a.size();
        int i, j;

        for (i = 0, j = 0; j < n; j++) {
            if (a.get(j) != b) {
                a.set(i, a.get(j));
                i++;
            }
        }

        return i;
    }
}

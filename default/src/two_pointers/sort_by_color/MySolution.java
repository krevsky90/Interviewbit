package two_pointers.sort_by_color;

import java.util.ArrayList;

/**
 * complexity:
 * loop i -> O(n)
 * color.length loops j = 3 loops j = 3*O(n)
 *
 * so.. complexity = 4*O(n)
 */
public class MySolution {
    public void sortColors(ArrayList<Integer> a) {
        int i = 0;
        int j;
        int[] colors = new int[]{0, 1, 2};
        //Input : [0 1 2 0 1 2]. i = 0, j = 0; color = 0
        //Input : [0 0 2 1 1 2]. i = 2, j = 0, color = 1
        //        [0 0 1 2 1 2]. i = 3, j = 4, color = 1
        //        [0 0 1 1 2 2]. i = 4, j = 5, color = 1
        //        [0 0 1 1 2 2]. i = 4, j = 0, color = 2
        while (i < a.size()) {
            for (int color : colors) {
                j = 0;
                while (j < a.size()) {
                    if (a.get(j).intValue() == color) {
                        if (i != j) {
                            //swap
                            Integer temp = a.get(i);
                            a.set(i, a.get(j));
                            a.set(j, temp);
                        }
                        i++;
                        j++;
                    } else {
                        j++;
                    }
                }
            }
        }
    }
}

package math.rearrange_array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * I don't take care about extra space O(1)
 * so the solution is not fit to initial requirements
 */
public class MySolution {
    public void arrange(ArrayList<Integer> a) {
        //i 0 1 2 3 4
        //a 4 0 2 1 3
        //b 3 4 2 0 1
        ArrayList<Integer> tempA = new ArrayList<Integer>(a.size());

        for (int i = 0; i < a.size(); i++) {
            Integer index = a.get(i);
            Integer value = a.get(index);
            tempA.add(value);
        }

        Collections.copy(a, tempA);
    }
}


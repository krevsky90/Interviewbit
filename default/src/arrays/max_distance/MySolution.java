package arrays.max_distance;

import java.util.*;

public class MySolution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        if (A.length < 2) {
            return 0;
        }

        List<Integer> list = new ArrayList<Integer>(A.length);
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(list.size());
        for (Integer v : list) {
            map.put(v, list.indexOf(v));
        }

        Collections.sort(list);

        List<Integer> indexes = new ArrayList<Integer>(list.size());
        for (Integer sv : list) {
            indexes.add(map.get(sv));
        }

        int result = 0;
        for (int i = 0; i < indexes.size() - 1; i++) {
            for (int j = i + 1; j < indexes.size(); j++) {
                if (j > i) {
                    result = Math.max(result, indexes.get(j) - indexes.get(i));
                }
            }
        }

        return result;
    }
}

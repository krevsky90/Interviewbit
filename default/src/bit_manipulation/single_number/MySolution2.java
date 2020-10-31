package bit_manipulation.single_number;

import java.util.ArrayList;
import java.util.List;

public class MySolution2 {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        List<String> s = new ArrayList<>();
        for (Integer i : A) {
            if (!s.contains(i.toString())) {
                s.add(String.valueOf(i));
            } else {
                s.remove(String.valueOf(i));
            }
        }

        return Integer.valueOf(s.get(0));
    }
}

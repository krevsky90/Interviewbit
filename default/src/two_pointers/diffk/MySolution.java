package two_pointers.diffk;

import java.util.ArrayList;

public class MySolution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        int j = A.size() - 2;
        for (int i = A.size() - 1; i > 0; i--) {
            for (; j >= 0; j--) {
                if (i != j && (A.get(i) - A.get(j) == B)) {
                    return 1;
                } else if (A.get(i) - A.get(j) > B) {
                    break;
                }
            }
        }

        return 0;
    }
}

package math.numbers_of_length_n_and_value_less_than_k;

import java.util.ArrayList;
import java.util.List;

public class MySolution {
    public int solve(int[] A, int B, int C) {
        int lenC = String.valueOf(C).length();

        //find unique numbers of A
        List<Integer> uniqueListA = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (!uniqueListA.contains(A[i])) {
                uniqueListA.add(A[i]);
            }
        }

        if (B < lenC) {
            if (B == 1) {
                return uniqueListA.size();
            } else {
                if (uniqueListA.contains(0)) {
                    return (uniqueListA.size() - 1) * (int) Math.pow(uniqueListA.size(), B - 1);
                } else {
                    return (int) Math.pow(uniqueListA.size(), B);
                }
            }
        } else if (B > lenC) {
            return 0;
        } else {
            if (B == 1) {
                int result = 0;
                for (Integer q : uniqueListA) {
                    if (q < C) {
                        result++;
                    }
                }

                return result;
            } else {
                int x = getX(C, lenC - 1, uniqueListA);
                if (uniqueListA.contains(0)) {
                    return x - (int) Math.pow(uniqueListA.size(), B - 1);
                } else {
                    return x;
                }
            }
        }
    }

    public int getX(int C, int len, List<Integer> uniqueListA) {
        if (len < 0) {
            return 0;
        }

        int result = 0;

        int Ci = C / (int) Math.pow(10, len);
        C -= Ci * Math.pow(10, len);
        for (Integer q : uniqueListA) {
            if (q < Ci) {
                result++;
            }
        }

        result *= Math.pow(uniqueListA.size(), len);
        if (uniqueListA.contains(Ci)) {
            return result + getX(C, len - 1, uniqueListA);
        } else {
            return result;
        }
    }
}

package math.factorization.all_factors.java_array.editorial;

import java.util.ArrayList;

/**
 * WITHOUT SORTING!
 */
public class Solution {
    public int[] allFactors(int A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                if (A / i == i) {
                    ls.add(i);
                } else {
                    ls.add(i);
                    list.add(A / i);
                }
            }
        }
        int len1 = ls.size();
        int len2 = list.size();
        int a[] = new int[len1 + len2];
        int i = 0;
        for (; i < len1; i++) {
            a[i] = ls.get(i);
        }
        int x = len2 - 1;
        for (int j = i; j < len1 + len2; j++) {
            a[j] = list.get(x);
            x--;
        }
        //Arrays.sort(a);
        return a;
    }
}
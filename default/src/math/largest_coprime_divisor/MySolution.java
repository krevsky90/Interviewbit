package math.largest_coprime_divisor;

import java.util.ArrayList;
import java.util.List;

public class MySolution {
    public static void main(String[] args) {
        int A = 2;
        int B = 3;

        int result = cpFact(A, B);
    }

    public static int cpFact(int A, int B) {
        List<Integer> allFactorsA = allPrimeFactors(A);
        List<Integer> allFactorsB = allPrimeFactors(B);

        for (int i = 0; i < allFactorsA.size(); i++) {
            if (allFactorsB.contains(allFactorsA.get(i))) {
                allFactorsA.set(i, 1);
            }
        }

        int result = 1;
        for (int i = 0; i < allFactorsA.size(); i++) {
            result *= allFactorsA.get(i);
        }

        return result;
    }

    // p > q
    public int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }

    public static List<Integer> allPrimeFactors(int A) {
        List<Integer> listPrime = new ArrayList<Integer>();
        int tempA = A;
        for (int i = 2; i <= A; i++) {
            while (tempA % i == 0) {
                listPrime.add(i);
                tempA = tempA / i;
            }
        }

        return listPrime;
    }

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

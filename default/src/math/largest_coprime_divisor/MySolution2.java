package math.largest_coprime_divisor;

import java.util.ArrayList;
import java.util.List;

public class MySolution2 {
    public static void main(String[] args) {
        int A = 24;
        int B = 36;

        int result = cpFact(A, B);
    }

    public static int cpFact(int A, int B) {
        // List<Integer> allFactorsA = allPrimeFactors(A);
        List<Integer> allFactorsB = allDistinctPrimeFactors(B);

        for (int i = 0; i < allFactorsB.size(); i++) {
            while (A % allFactorsB.get(i) == 0) {
                A = A / allFactorsB.get(i);
            }
        }

        return A;
    }

    public static List<Integer> allDistinctPrimeFactors(int A) {
        List<Integer> listPrime = new ArrayList<Integer>();
        int tempA = A;
        for (int i = 2; i <= A; i++) {
            while (tempA % i == 0) {
                if (!listPrime.contains(i)) {
                    listPrime.add(i);
                }
                tempA = tempA / i;
            }
        }

        return listPrime;
    }
}

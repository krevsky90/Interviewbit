package math.prime_sum;

import java.util.ArrayList;

public class MySolution {
    public ArrayList<Integer> primesum(int A) {
        boolean[] primes = new boolean[A + 1];

        for (int i = 2; i <= A; i++) {
            primes[i] = true;
        }

        int num = 2;
        int num_max = (int) Math.sqrt(A);
        while (num <= num_max) {
            if (primes[num]) {
                int mul = num;

                while (num * mul <= A) {
                    primes[num * mul] = false;
                    mul++;
                }
            }
            num++;
        }


        Integer a = 2;
        ArrayList<Integer> result = new ArrayList<>(2);
        while (a <= A / 2) {
            if (primes[a] && primes[A - a]) {
                result.add(a);
                result.add(A - a);
                break;
            }
            a++;
        }

        return result;
    }
}

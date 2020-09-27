package math.factorization.prime_numbers.java_array.editorial;

public class Solution {
    public int[] sieve(int n) {
        boolean[] candidates = new boolean[n + 1];
        int count = n - 1;
        for (int i = 2; i <= n; i++) {
            candidates[i] = true;
        }

        for (int j = 2; j <= Math.sqrt(n); j++) {
            for (int k = j; k * j <= n; k++) {
                if (candidates[j * k] == true) {
                    candidates[j * k] = false;
                    count--;
                }
            }
        }

        int[] primes = new int[count];
        int pi = 0;
        for (int p = 0; p <= n; p++) {
            if (candidates[p] == true) {
                primes[pi] = p;
                pi++;
            }
        }
        return primes;
    }
}
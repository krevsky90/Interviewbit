package math.prime_sum.java.editorial;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> Arr = new ArrayList<>();
        for (int i = 2; i <= A / 2; i++) {
            if (pr(i) == true && pr(A - i) == true)//check if both are prime or not
            {
                Arr.add(i);
                Arr.add(A - i);
                break;//As checking starts from 2, we always get lexicographically smaller
            }
        }
        return Arr;
    }

    public boolean pr(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;//As soon as factor is found break as its not prime
        }
        return true;
    }
}
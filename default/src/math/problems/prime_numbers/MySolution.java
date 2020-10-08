package math.problems.prime_numbers;

import java.util.ArrayList;
import java.util.List;

public class MySolution {
    public int[] sieve(int A) {
        //if initArr[i] == 0 then index of this element is NOT prime number
        //if initArr[i] == 1 then index of this element is prime number
        int[] initArr = new int[A + 1];
        for (int i = 0; i <= A; i++) {
            initArr[i] = 1;
        }

        initArr[0] = 0;
        initArr[1] = 0;
        for (int i = 2; i <= Math.sqrt(A); i++) {
            // if (initArr[i] == 1) {
            for (int j = 2; j * i <= A; j++) {
                initArr[i * j] = 0;
            }
            // }
        }

        //select numbers that are prime
        List<Integer> resList = new ArrayList<Integer>();
        for (int i = 2; i <= A; i++) {
            if (initArr[i] == 1) {
                resList.add(i);
            }
        }

        //convert List to Array
        int[] resArray = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            resArray[i] = resList.get(i);
        }

        return resArray;
    }
}

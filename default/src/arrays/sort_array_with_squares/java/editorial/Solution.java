package arrays.sort_array_with_squares.java.editorial;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        int size = A.size();
        ArrayList<Integer> answer = new ArrayList<Integer>(size);

        if(size == 0) {
            return answer;
        }
        else if(size == 1) {
            answer.add(A.get(0) * A.get(0));
            return answer;
        }

        int i = 0;
        int j = size - 1;
        int k = size - 1;

        while (k >=0) {
            int firstElem = Math.abs(A.get(i));
            int lastElem = Math.abs(A.get(j));

            if(firstElem < lastElem) {
                answer.add(lastElem * lastElem);
                // A.add(answer.a, );
                j--;
            }
            else {
                answer.add(firstElem * firstElem);
                // A.set(k, firstElem * firstElem);
                i++;
            }
            k--;
        }
        Collections.reverse(answer);
        return answer;

    }
}
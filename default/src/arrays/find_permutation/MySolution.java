package arrays.find_permutation;

import java.util.ArrayList;

public class MySolution {
    public static void main(String[] args) {
        int n = 3;
        String s = "ID";
        ArrayList<Integer> result = findPerm(s, n);
        System.out.println("");
    }

    public static ArrayList<Integer> findPerm(final String A, int B) {
        int lenA = A.length();
        int startIndex = 1;
        int endIndex = B;

        ArrayList<Integer> result = new ArrayList<Integer>(B);
        for (int i = 0; i < lenA; i++) {
            String curChar = A.substring(i,i+1);
            if ("I".equals(curChar)) {
                result.add(startIndex);
                startIndex++;
            } else if ("D".equals(curChar)) {
                result.add(endIndex);
                endIndex--;
            }
        }

        result.add(endIndex);

        return result;
    }

}

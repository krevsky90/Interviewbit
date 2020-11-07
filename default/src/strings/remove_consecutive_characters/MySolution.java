package strings.remove_consecutive_characters;

import java.util.HashSet;
import java.util.Set;

public class MySolution {
    public String solve(String A, int B) {
        char[] arr = A.toCharArray();
        if (A.length() == 0) {
            return "";
        }

        int curIndex = 0;
        char curChar = arr[0];

        Set<String> strToRemove = new HashSet<>();

        //A = aaagccc, B = 3
        for (int i = 1; i < A.length(); i++) {
            if (arr[i] != curChar) {
                if (i - curIndex == B) {
                    strToRemove.add(A.substring(curIndex, i));
                }

                curChar = arr[i];
                curIndex = i;
            }
        }

        if (A.length() - curIndex == B) {
            strToRemove.add(A.substring(curIndex));
        }

        for (String s : strToRemove) {
            A = A.replaceAll(s, "");
        }

        return A;
    }
}
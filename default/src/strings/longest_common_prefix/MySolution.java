package strings.longest_common_prefix;

import java.util.ArrayList;

public class MySolution {
    public String longestCommonPrefix(ArrayList<String> A) {
        if (A.size() == 0)
            return "";

        if (A.size() == 1)
            return A.get(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.get(0).length(); i++) {
            char c = A.get(0).charAt(i);

            for (String a : A) {
                if (a.length() <= i || a.charAt(i) != c) {
                    return sb.toString();
                }
            }

            sb.append(c);
        }

        return sb.toString();
    }
}

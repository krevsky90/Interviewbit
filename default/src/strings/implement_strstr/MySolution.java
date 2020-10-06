package strings.implement_strstr;


/**
 * like java_array.fastest but WORSE!
 */
public class MySolution {
    public static void main(String[] args) {
        int res = strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba", "babaaa");
        System.out.println(res);
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int strStr(final String A, final String B) {
        if (A == null || A.isEmpty() || B == null || B.isEmpty()) {
            return -1;
        }

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        for (int i = 0; i < a.length; i++) {
            int j = 0;
            while (j < b.length && i + j < a.length) {
                if (a[i + j] != b[j]) {
                    break;
                }
                j++;
            }

            if (j == b.length) {
                return i;
            }
        }

        return -1;
    }
}

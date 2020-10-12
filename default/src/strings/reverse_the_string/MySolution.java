package strings.reverse_the_string;

/**
 * It can be improved by A = A.trim(); to remove trailing spaces
 */
public class MySolution {
    public static void main(String[] args) {
        String A = "  t     4e";
        String res = solve(A);
        System.out.println(res);
    }
    public static String solve(String A) {
        char[] charArr = A.toCharArray();
        StringBuilder sb = new StringBuilder();
        int end = -1;
        for (int i = charArr.length - 1; i >= 0 ; i--) {
            if (charArr[i] != ' ') {
                if (end == -1) {
                    end = i + 1;
                }
            } else {
                if (end == -1) {
                    //do nothing
                } else {
//                    sb.append(A.substring(i+1, end)).append(" ");
                    sb.append(A, i+1, end).append(" ");
                    end = -1;
                }
            }
        }

        String sbStr;
        if (end != -1) {
            sb.append(A.substring(0, end));
            sbStr = sb.toString();
        } else {
            sbStr = sb.toString();
            if (' ' == sbStr.charAt(sbStr.length() - 1)) {
                sbStr = sbStr.substring(0, sbStr.length() - 1);
            }
        }

        return sbStr;
    }
}

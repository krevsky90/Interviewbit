package strings.add_binary_strings;

public class MySolution {
    public String addBinary(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();

        String reverseA = new StringBuilder(A).reverse().toString();
        String reverseB = new StringBuilder(B).reverse().toString();
        int i = 0;
        int over = 0;
        StringBuilder sb = new StringBuilder();
        while (i < Math.max(lenA, lenB)) {
            int addA = (i < lenA) ? Integer.parseInt(reverseA.substring(i,i+1)) : 0;
            int addB = (i < lenB) ? Integer.parseInt(reverseB.substring(i,i+1)) : 0;
            int tempDigit = addA + addB + over;

            if (tempDigit == 3) {
                sb.append("1");
                over = 1;
            } else if (tempDigit == 2) {
                sb.append("0");
                over = 1;
            } else if (tempDigit == 1) {
                sb.append("1");
                over = 0;
            } else if (tempDigit == 0) {
                sb.append("0");
                over = 0;
            }

            i++;
        }

        if (over == 1) {
            sb.append(over);
        }

        return sb.reverse().toString();
    }
}

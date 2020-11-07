package strings.zigzag_string;

/**
 * like java.lightweight but
 * the cases row = 0 and row = B-1 are separately handled in lightweight solution
 * and 'flag' is used instead of my 'i'
 */
public class MySolution {
    public String convert(String A, int B) {
        StringBuilder result = new StringBuilder();
        StringBuilder rowStr = new StringBuilder();
        //input: PAYPALISHIRING, B = 3
        //output: PAHNAPLSIIGYIR
        //P.......A........H.......N
        //..A..P....L....S....I...I....G
        //....Y.........I........R
        if (B == 1) {
            return A;
        }

        for (int row = 0; row < B; row++) {
            rowStr.setLength(0);
            int i = 0;
            int step = 0;
            int curPos = row;
            boolean addLetter = true;
            while (curPos < A.length()) {
                if (addLetter) {
                    rowStr.append(A.substring(curPos, curPos + 1));
                }

                if (i % 2 == 1) {
                    step = 2 * row;
                } else {
                    step = 2 * (B - 1 - row);
                }

                if (step > 0) {
                    curPos += step;
                    addLetter = true;
                } else {
                    addLetter = false;
                }

                i++;
            }

            result.append(rowStr.toString());
        }

        return result.toString();
    }
}

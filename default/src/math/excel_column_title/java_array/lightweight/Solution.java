package math.excel_column_title.java_array.lightweight;

public class Solution {
    public String convertToTitle(int A) {
        StringBuffer title = new StringBuffer();
        while (A > 0) {
            int reminder = A % 26;
            char currentChar = ' ';
            if (reminder == 0)
                currentChar = 'Z';
            else
                currentChar = (char) (reminder + 64);

            title.insert(0, currentChar);
            A /= 26;

            if (reminder == 0)
                A -= 1;
        }
        return title.toString();
    }
}
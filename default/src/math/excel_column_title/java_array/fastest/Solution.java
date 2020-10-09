package math.excel_column_title.java_array.fastest;

public class Solution {
    public String convertToTitle(int A) {
        StringBuilder result = new StringBuilder();
        while (A > 0) {
            A = A - 1;
            result.insert(0, (char) ('A' + (A % 26)));
            A = A / 26;
        }

        return result.toString();
    }
}
package strings.valid_number.java.editorial;

public class Solution {
    public int isNumber(final String a) {
        return (a.matches("\\s*[\\-\\+]?([0-9]*\\.?)?[0-9]+(e[\\-\\+]?[0-9]+)?\\s*")) ? 1 : 0;
    }
}

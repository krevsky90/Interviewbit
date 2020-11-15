package strings.valid_number;

import java.util.Arrays;
import java.util.List;

public class MySolution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isNumber(final String A) {
        List<Character> availableChars = Arrays.asList(' ', '.', '-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'E', 'e');

        //validation of all symbols in A using ASCII table http://www.asciitable.com/
        for (int i = 0; i < A.length(); i++) {
            if (!availableChars.contains(A.charAt(i))) {
                return 0;
            }
        }

        try {
            Double d = new Double(A);
            //extra validation whether the symbol after '.' is digit
            int indexOfDot = A.indexOf('.');
            if (indexOfDot > 0) {
                if (A.length() == indexOfDot + 1) {
                    return 0;
                } else if (A.length() > indexOfDot + 1) {
                    char nextAfterDot = A.charAt(indexOfDot + 1);
                    if (!Character.isDigit(nextAfterDot)) {
                        return 0;
                    }
                }
            }
        } catch (NumberFormatException ex) {
            //it means that A is not Double number -> is not number at all!
            return 0;
        }

        return 1;
    }
}

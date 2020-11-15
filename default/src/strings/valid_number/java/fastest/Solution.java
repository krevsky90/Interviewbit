package strings.valid_number.java.fastest;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isNumber(final String s) {
        String str;
        str = s.trim(); // trims the white spaces.

        if (str.length() == 0)
            return 0;

        // if string is of length 1 and the only
        // character is not a digit
        if (str.length() == 1 &&
                !Character.isDigit(str.charAt(0)))
            return 0;

        // If the 1st char is not '+', '-', '.' or digit
        if (str.charAt(0) != '+' && str.charAt(0) != '-' &&
                !Character.isDigit(str.charAt(0)) &&
                str.charAt(0) != '.')
            return 0;

        // To check if a '.' or 'e' is found in given
        // string. We use this flag to make sure that
        // either of them appear only once.
        boolean flagDotOrE = false;

        for (int i = 1; i < str.length(); i++) {
            // If any of the char does not belong to
            // {digit, +, -, ., e}
            if (!Character.isDigit(str.charAt(i)) &&
                    str.charAt(i) != 'e' && str.charAt(i) != '.' &&
                    str.charAt(i) != '+' && str.charAt(i) != '-')
                return 0;

            if (str.charAt(i) == '.') {
                // checks if the char 'e' has already
                // occurred before '.' If yes, return 0.
                if (flagDotOrE == true)
                    return 0;

                // If '.' is the last character.
                if (i + 1 >= str.length())
                    return 0;

                // if '.' is not followed by a digit.
                if (!Character.isDigit(str.charAt(i + 1)))
                    return 0;
            } else if (str.charAt(i) == 'e') {
                // set flagDotOrE = 1 when e is encountered.
                flagDotOrE = true;

                // if there is no digit before 'e'.
                if (!Character.isDigit(str.charAt(i - 1)))
                    return 0;

                // If 'e' is the last Character
                if (i + 1 >= str.length())
                    return 0;

                // if e is not followed either by '.',
                // '+', '-' or a digit
                if (!Character.isDigit(str.charAt(i + 1)) &&
                        str.charAt(i + 1) != '+' &&
                        str.charAt(i + 1) != '-')
                    return 0;
            }
        }

        /* If the string skips all above cases, then
           it is numeric*/
        return 1;
    }

}
package strings.integer_to_roman.java.editorial;

public class Solution {
    public String intToRoman(int n) {
        String o[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String t[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String m[] = {"", "M", "MM", "MMM"};
        return m[n / 1000] + c[(n % 1000) / 100] + t[(n % 100) / 10] + o[n % 10];
    }
}
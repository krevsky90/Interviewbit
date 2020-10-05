package strings.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class MySolution {
    public int romanToInt(String A) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int sign = 1;
        for (int i = A.length() - 1; i >= 0; i--) {
            char cur = A.charAt(i);
            char prev = i >= 1 ? A.charAt(i - 1) : '0';
            if ('0' == prev) {
                result += sign * map.get(cur);
                return result;
            }

            if (map.get(prev) >= map.get(cur)) {
                result += sign * map.get(cur);
                sign = 1;
            } else {
                result += sign * map.get(cur);
                sign = -1;
            }
        }

        return result;
    }
}

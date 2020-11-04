package strings.integer_to_roman.java.lightweight;

import java.util.HashMap;

public class Solution {
    private static int[] bases = {
            1000,
            900,
            500,
            400,
            100,
            90,
            50,
            40,
            10,
            9,
            5,
            4,
            1
    };

    private static HashMap<Integer, String> map = new HashMap<>();

    private static void setup() {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }

    public String intToRoman(int a) {
        setup();
        String result = "";
        for (int i : bases) {
            while (a >= i) {
                result += map.get(i);
                a -= i;
            }
        }
        return result;
    }
}
package strings.integer_to_roman.java.fastest;

public class Solution {
    public String intToRoman(int a) {
        StringBuilder sb = new StringBuilder();
        while (a > 5) {
            if (a / 1000 != 0) {

                int p = a / 1000;
                int q = a % 1000;
                for (int i = 0; i < p; i++) {
                    sb = sb.append(value(1000));
                }
                a = q;
            } else if (a / 500 != 0) {
                if (a >= 900 && a < 1000) {
                    sb.append("CM");
                    a = a % 900;
                } else {
                    int p = a / 500;
                    int q = a % 500;
                    for (int i = 0; i < p; i++) {
                        sb = sb.append(value(500));
                    }
                    a = q;
                }
            } else if (a / 100 != 0) {
                if (a >= 400 && a < 500) {
                    sb.append("CD");
                    a = a % 400;
                } else {
                    int p = a / 100;
                    int q = a % 100;
                    for (int i = 0; i < p; i++) {
                        sb = sb.append(value(100));
                    }
                    a = q;
                }
            } else if (a / 50 != 0) {
                if (a >= 90 && a < 100) {
                    sb.append("XC");
                    a = a % 90;
                } else {
                    int p = a / 50;
                    int q = a % 50;
                    for (int i = 0; i < p; i++) {
                        sb = sb.append(value(50));
                    }
                    a = q;
                }
            } else if (a / 10 != 0) {
                if (a >= 40 && a < 50) {
                    sb.append("XL");
                    a = a % 40;
                } else {
                    int p = a / 10;
                    int q = a % 10;
                    for (int i = 0; i < p; i++) {
                        sb = sb.append(value(10));
                    }
                    a = q;
                }
            } else if (a / 5 != 0) {
                if (a == 9) {
                    sb.append("IX");
                    return sb.toString();

                } else {
                    int p = a / 5;
                    int q = a % 5;
                    for (int i = 0; i < p; i++) {
                        sb = sb.append(value(5));
                    }
                    a = q;
                }
            }
        }
        if (a == 0) {
            return sb.toString();
        }
        sb.append(value(a));
        return sb.toString();

    }

    public String value(int x) {
        if (x == 1) {
            return "I";
        }
        if (x == 2) {
            return "II";
        }
        if (x == 3) {
            return "III";
        }
        if (x == 4) {
            return "IV";
        }
        if (x == 5) {
            return "V";
        }
        if (x == 10) {
            return "X";
        }
        if (x == 50) {
            return "L";
        }
        if (x == 100) {
            return "C";
        }
        if (x == 500) {
            return "D";
        }
        if (x == 1000) {
            return "M";
        }
        return null;
    }
}
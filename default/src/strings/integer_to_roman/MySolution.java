package strings.integer_to_roman;

public class MySolution {
    public String intToRoman(int A) {
        if (A > 3999 || A < 1) {
            return "-1";
        }

        String result = "";

        if (A == 0) {
            return result;
        }

        while (A > 0) {
            if (A >= 1000) {
                result += "M";
                A -= 1000;
            } else if (A >= 900) {
                result += "CM";
                A -= 900;
            } else if (A >= 500) {
                result += "D";
                A -= 500;
            } else if (A >= 400) {
                result += "CD";
                A -= 400;
            } else if (A >= 100) {
                result += "C";
                A -= 100;
            } else if (A >= 90) {
                result += "XC";
                A -= 90;
            } else if (A >= 50) {
                result += "L";
                A -= 50;
            } else if (A >= 40) {
                result += "XL";
                A -= 40;
            } else if (A >= 10) {
                result += "X";
                A -= 10;
            } else if (A == 9) {
                result += "IX";
                A -= 9;
            } else if (A >= 5) {
                result += "V";
                A -= 5;
            } else if (A == 4) {
                result += "IV";
                A -= 4;
            } else if (A >= 1) {
                result += "I";
                A -= 1;
            }
        }

        return result;
    }
}

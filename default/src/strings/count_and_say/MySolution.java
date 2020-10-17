package strings.count_and_say;

public class MySolution {
    public String countAndSay(int A) {
        String number = "1";
        if (A == 1) {
            return number;
        }

        int count = 1;
        StringBuilder sb = new StringBuilder();
        while (count < A) {
            String curDigit = "";
            int countOfDigit = 0;
            sb.setLength(0);


            for (int i = 0; i < number.length(); i++) {
                String tempDigit = number.substring(i, i + 1);
                if ("".equals(curDigit)) {
                    curDigit = tempDigit;
                    countOfDigit = 1;
                } else if (curDigit.equals(tempDigit)) {
                    countOfDigit++;
                } else {
                    sb.append(countOfDigit).append(curDigit);
                    curDigit = tempDigit;
                    countOfDigit = 1;
                }
            }

            number = sb.append(countOfDigit).append(curDigit).toString();
            count++;
        }

        return sb.toString();
    }
}

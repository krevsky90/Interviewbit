package math.excel_column_title;

/**
 * I've get 0 points since I couldn't figure out the idea to subctract 1 from A. i.e. A = A - 1
 * like java_array.lightweight solution
 */
public class MySolution {
    public static void main(String[] args) {
        int A = 357;
        System.out.println(convertToTitle(A));
    }

    public static String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        while (A > 0) {
            int ostatok = A % 26;
            A = A / 26;
            if (ostatok == 0) {
                ostatok = 26;
                A--;
            }

            char tempC = (char) (64 + ostatok);
            sb.append(tempC);
        }

        return sb.reverse().toString();
    }
}

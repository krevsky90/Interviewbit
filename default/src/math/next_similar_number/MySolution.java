package math.next_similar_number;

/**
 * like java.editorial
 */
public class MySolution {
    public static void main(String[] args) {
        String A = "218765";
        String res = solve(A);
        System.out.println(res);
    }

    public static String solve(String A) {
        //218755 -> 258751 -> 251578
        //2665 -> 5266
        //2165 -> 2561 -> 2516
        //656 -> 665
        //16765 -> 17665 -> 17566
        //11135432 - 11145332 - 11142335
        int i = A.length() - 1;
        StringBuilder sb = new StringBuilder();
        String result = "-1";

        while (i > 0 && Integer.valueOf(A.substring(i,i+1)).intValue() <= Integer.valueOf(A.substring(i-1,i)).intValue()) {
            i--;
        }

        if (i > 0) {
            int firstLessValue = Integer.valueOf(A.substring(i-1,i)).intValue();
            int j = A.length() - 1;
            while (firstLessValue >= Integer.valueOf(A.substring(j,j+1)).intValue()) {
                j--;
            }

            //swap i-1-th and j-th elements
            sb = new StringBuilder(A);
            sb.setCharAt(i-1, A.charAt(j));
            sb.setCharAt(j, A.charAt(i-1));
            result = sb.toString();

            sb.setLength(0);
            sb.append(result.substring(i));

            result = result.substring(0,i) + sb.reverse().toString();
        }

        return result;
    }
}

package math.excel_column_number.java.fastest;

/**
 * NOTE:
 * 'A' is 65
 * 'B' is 66
 * etc
 */
public class Solution {
    public static void main(String[] args) {
        int res = titleToNumber("AB");
        System.out.println(res);
    }

    public static int titleToNumber(String A) {
        //use toCharArray instead of str.substring(i,i+1);
        char[] b = A.toCharArray();
        int result= 0;
        for(int i=0;i<b.length;i++){
            result = result*26 + (b[i]-'A' + 1);
        }
        return result;
    }
}
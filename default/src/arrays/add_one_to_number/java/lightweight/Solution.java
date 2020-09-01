package arrays.add_one_to_number.java.lightweight;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * interesting idea to use existing functional of BigInteger class and two transitions:
 * ArrayList -> String -> BigInteger
 * and
 * BigInteger -> char[] -> ArrayList
 */
public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        ArrayList<Integer> result = new ArrayList<>();
        if (A.size() > 0) {

            StringBuffer input = new StringBuffer("");
            for(int i = 0; i < A.size() ; i++){
                input.append(A.get(i).toString());
            }
            BigInteger number = new BigInteger(input.toString()) ;

            //Adding one to Number
            number = number.add(new BigInteger("1"));
            char[] alphaResult = number.toString().toCharArray();

            //creating result
            for (int j = 0; j < alphaResult.length; j++) {
                result.add(Character.getNumericValue(alphaResult[j]));
            }
        }
        else{
            return A;
        }
        return result;
    }
}

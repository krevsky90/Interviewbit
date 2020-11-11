package bit_manipulation.reverse_bits.java.editorial;

/**
 * lightweight solution = editorial solution
 */
public class Solution {
    public static void main(String[] args) {
        long A = 3L;
        reverse(A);
        System.out.println(0 | 1);
    }
    public static long reverse(long A) {
        long rev = 0;

        for (int i = 0; i < 32; i++) {
            rev <<= 1;  // *2 to check the next bit if A and
            if ((A & (1 << i)) != 0)    //if (i-th bit of A) = 1 then we set current the smallest bit of rev to 1
                rev |= 1;   //i.e. res += 1
        }

        return rev;
    }
}

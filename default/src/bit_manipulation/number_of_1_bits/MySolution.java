package bit_manipulation.number_of_1_bits;

public class MySolution {
    public int numSetBits(long a) {
        int count = 0;
        while (a > 0) {
            if (a % 2 == 1) {
                count++;
            }
            a = a / 2;
        }

        return count;
    }
}

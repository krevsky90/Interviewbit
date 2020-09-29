package math.trailing_zeros_in_factorial;

public class MySolution {
    public int trailingZeroes(int A) {
        //since A contains '5' less than '2' -> we should count only '5'
//        int numbOf2 = getNumbOfN(A, 2);
        int numbOf5 = getNumbOfN(A, 5);

//        return Math.min(numbOf2, numbOf5);
        return numbOf5;
    }

    public int getNumbOfN(int A, int N) {
        int result = 0;
        int maxPower = (int) (Math.log(A) / Math.log(N));
        for (int i = 1; i <= maxPower; i++) {
            result += A / Math.pow(N, i);
        }

        return result;
    }
}

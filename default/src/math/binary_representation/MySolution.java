package math.binary_representation;

public class MySolution {
    public String findDigitsInBinary(int A) {
        StringBuilder sb = new StringBuilder();
        while (A >= 2) {
            int delta = A % 2;
            A = A / 2;
            sb.append(delta);
        }

        sb.append(A);
        return sb.reverse().toString();
    }
}


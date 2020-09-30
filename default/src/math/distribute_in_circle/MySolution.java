package math.distribute_in_circle;

public class MySolution {
    public int solve(int A, int B, int C) {
        return (A + C) % B - 1;
    }
}

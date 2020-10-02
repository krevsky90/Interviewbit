package math.grid_unique_paths;

/**
 * the same as java.editorial
 * but with extra function. that's why it is worse that java.editorial
 */
public class MySolution {
    public int uniquePaths(int A, int B) {
        if (A == 1 || B == 1) {
            return 1;
        }

        return getElement(A - 1, B - 1);
    }


    public int getElement(int i, int j) {
        if (i == 0 && j == 0) {
            return 0;
        } else if (i == 0 && j > 0) {
            return 1;
        } else if (i > 0 && j == 0) {
            return 1;
        } else {
            return getElement(i - 1, j) + getElement(i, j - 1);
        }
    }
}

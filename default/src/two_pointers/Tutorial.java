package two_pointers;

public class Tutorial {
    public static void main(String[] args) {
        int[] A = new int[5];
        A[0] = -3;
        A[1] = -1;
        A[2] = 0;
        A[3] = 1;
        A[4] = 9;

        int j = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            for (; j > i; j--) {
                if (i != j && A[i] + A[j] == 0) System.out.println("i = " + i + ", j = " + j);
                if (A[i] + A[j] < 0) break; // Clearly A[i] + A[j] would decrease as j decreases.
            }
        }

        System.out.println("0");
    }



}

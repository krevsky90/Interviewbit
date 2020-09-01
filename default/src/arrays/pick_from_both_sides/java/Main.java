package arrays.pick_from_both_sides.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Integer[] A = new Integer[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        Integer[] A = new Integer[]{5, -2, 3, 1, 2};
        int B = 3;
        int res = new arrays.pick_from_both_sides.java.editorial.Solution().solve(Arrays.asList(A), B);

        System.out.println(res);
    }
}

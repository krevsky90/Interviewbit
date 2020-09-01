package arrays.pick_from_both_sides;

/**
 * https://www.interviewbit.com/problems/pick-from-both-sides/
 */
public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        int B = 48;
        int res = new MySolution().solve(A, B);

        System.out.println(res);
    }
}

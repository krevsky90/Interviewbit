package arrays.largest_number;

public class MySolution {
    public static void main(String[] args) {
        MyHelper helper = new MyHelper();
        int[] A = new int[]{3, 30, 34, 5, 9};
//                int[] A = new int[]{743, 744, 609, 75, 764, 241, 20, 166, 327, 282, 725, 659, 795, 134, 411, 387, 707, 283, 123, 513, 465, 117, 212, 74, 564, 7, 178, 938, 212, 484, 257, 3, 922, 467, 62, 213, 720, 111, 1, 842, 653, 79, 601, 187, 548, 985, 932, 640, 267, 716, 256, 634, 601, 898, 888, 496, 942, 748, 613, 670, 885, 953, 23, 282, 667, 354, 140, 359, 280, 593, 314, 843, 18, 307, 244, 384, 850};
        String res = helper.largestNumber(A);

        System.out.println(res);
    }
}

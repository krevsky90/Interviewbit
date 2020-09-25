package arrays.largest_number;

import java.util.Arrays;

public class MyHelper {
    class Num implements Comparable<Num> {
        private Integer n;

        public Num(int i) {
            this.n = i;
        }

        public Integer getN() {
            return n;
        }

        @Override
        public int compareTo(Num o) {
            String strN = n.toString();
            String strO = o.getN().toString();

            if (Long.valueOf(strN + strO) > Long.valueOf(strO + strN)) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public String largestNumber(final int[] A) {
        Num[] arrNum = new Num[A.length];
        for (int i = 0; i < A.length; i++) {
            arrNum[i] = new Num(A[i]);
        }

        Arrays.sort(arrNum);

        if (arrNum[0].getN() == 0) {
            return "0";
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arrNum.length; i++) {
            sb.append(arrNum[i].getN());
        }

        return sb.toString();
    }
}

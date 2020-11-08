package strings.valid_ip_addresses;

import java.util.ArrayList;
import java.util.Collections;

public class MySolution {
    public static void main(String[] args) {
        String A = "0100100";
        ArrayList<String> result = restoreIpAddresses(A);
        System.out.println("");
    }

    public static ArrayList<String> restoreIpAddresses(String A) {
        if (A.length() > 12 || A.length() < 4) {
            return new ArrayList<>();
        }

        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i1 = 1; i1 <= 3 ; i1++) {
            sb.setLength(0);

            if (i1 > A.length() || (A.charAt(0) == '0' && i1 > 1) || new Integer(A.substring(0, i1)) > 255) {
                continue;
            }

            for (int i2 = 1; i2 <= 3 ; i2++) {
                if (i1+i2 > A.length() || (A.charAt(i1) == '0' && i2 > 1) || new Integer(A.substring(i1, i1+i2)) > 255) {
                    continue;
                }

                for (int i3 = 1; i3 <= 3 ; i3++) {
                    if (i1+i2+i3 > A.length() || (A.charAt(i1+i2) == '0' && i3 > 1) || new Integer(A.substring(i1+i2, i1+i2+i3)) > 255) {
                        continue;
                    }

                    for (int i4 = 1; i4 <= 3 ; i4++) {
                        if (i1+i2+i3+i4 != A.length() || (A.charAt(i1+i2+i3) == '0' && i4 > 1) || new Integer(A.substring(i1+i2+i3, i1+i2+i3+i4)) > 255) {
                            continue;
                        }

                        sb.append(A, 0, i1).append(".");
                        sb.append(A, i1, i1+i2).append(".");
                        sb.append(A, i1+i2, i1+i2+i3).append(".");
                        sb.append(A, i1+i2+i3, i1+i2+i3+i4);

                        result.add(sb.toString());
                        sb.setLength(0);
                    }
                }
            }
        }

        Collections.sort(result);

        return result;
    }

}

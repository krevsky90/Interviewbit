package arrays.hotel_booking_possible;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * EXPLANATION WHY DON"T WE NEED TO TAKE INTO ACCOUNT RELATION BETWEEN I-TH ELEMENTS OF ARRIVE AND DEPART LISTS:
 * the 7th guest must arrive after 2 guests have left. Not necessarily the second guest, but any 2 guests. You can count the number of rooms occupied by keeping track of how many have entered and how many have checked out every day for a series of days.
 */
public class MySolution {
    public static void main(String[] args) {
        List<Integer> arrive = Arrays.asList(9, 47, 17, 39, 35, 35, 20, 18, 15, 34, 11, 2, 45, 46, 15, 33, 47, 47, 10, 11, 27);
        List<Integer> depart = Arrays.asList(32, 82, 39, 86, 81, 58, 64, 53, 40, 76, 40, 46, 63, 88, 56, 52, 50, 72, 22, 19, 38);
        int K = 16;
        boolean result = hotel(arrive, depart, K);
        System.out.println(result);
    }

    public static boolean hotel(List<Integer> arrive, List<Integer> depart, int K) {
        int N = arrive.size();
        Collections.sort(arrive);
        Collections.sort(depart);

        int i = 0;
        int j = 0;
        while (i < N && j < N) {
            if (arrive.get(i) < depart.get(j)) {
                i++;
            } else {
                j++;
            }

            if (i - j > K) {
                return false;
            }
        }

        return true;
    }
}

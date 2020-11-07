package strings.convert_to_palindrome;

/**
 * faster then MySolution1
 *
 * Like java.editorial but worse. because it is not necessary to call isPalindrome function.
 * It is just enough to compare 'begin' and 'end' elements
 */
public class MySolution2 {
    public int solve(String A) {
        int left = 0;
        int right = A.length() - 1;
        char[] arr = A.toCharArray();

        while (left <= right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            } else {
                if (isPalindrome(arr, left + 1, right)) {
                    return 1;
                } else if (isPalindrome(arr, left, right - 1)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        return 1;
    }

    public boolean isPalindrome(char[] arr, int left, int right) {
        while (left <= right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}

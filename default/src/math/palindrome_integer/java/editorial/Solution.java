package math.palindrome_integer.java.editorial;

public class Solution {
    public boolean isPalindrome(int a) {
        if (a == check(a))
            return true;
        else
            return false;
    }

    public int check(int num) {
        int reverted = 0;
        while (num > 0) {
            reverted = reverted * 10 + num % 10;
            num /= 10;
        }
        return reverted;
    }
}
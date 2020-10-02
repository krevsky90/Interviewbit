package math.grid_unique_paths.java.editorial;

public class Solution {
    public int uniquePaths(int a, int b) {
	      /* If either 1 row or 1 column are there then the only way to end
	         is to traverse through that row or column respectively.*/
        if (a == 1 || b == 1)
            return 1;
	      /*If there are more than one row and column then u need to move
	        either right or down reducing one row or one column respectively
	        and adding that way in answer*/
        else {
            int ans = 0;
            ans = uniquePaths(a - 1, b) + uniquePaths(a, b - 1);
            return ans;
        }
    }
}

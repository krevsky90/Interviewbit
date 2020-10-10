package math.anti_diagonals.java.lightweight;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < a.size() * 2 - 1; i++)
            res.add(new ArrayList<Integer>());

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(0).size(); j++) {
                res.get(i + j).add(a.get(i).get(j));
            }
        }

        return res;
    }
}
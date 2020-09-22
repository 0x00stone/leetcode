package leetcode.kidsWithCandies1431;

import java.util.ArrayList;
import java.util.List;

public class Solution{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i : candies ){
            max = i > max ? i :max ;
        }
        ArrayList< Boolean> list = new ArrayList<Boolean>();
        for(int j =0 ; j<= candies.length-1 ; j++){
            list.add(candies[j] + extraCandies >= max ? true :false);
        }
        return list;
    }
}
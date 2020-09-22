package leetcode.array.createTargetArray1389;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List list = new ArrayList();
        int[] ans = new int[index.length];
        for(int i = 0; i < index.length ; i++){
            list.add(index[i], nums[i]);
        }
        for(int j = 0; j < index.length ; j++){
            ans[j] = (int) list.get(j);
        }
        return ans;
    }
}
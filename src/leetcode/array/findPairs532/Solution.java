package leetcode.array.findPairs532;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Arrays.sort(nums);
        int start = 0, count = 0, prev = 1000000;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[start] > k || prev == nums[start]) {
                if (++start != i) i--;
            } else if (nums[i] - nums[start] == k) {
                prev = nums[start++];
                count++;
            }
        }
        return count;
    }
}
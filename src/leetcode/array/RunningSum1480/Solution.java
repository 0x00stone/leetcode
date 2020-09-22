package leetcode.array.RunningSum1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] list = new int[nums.length];
        list[0] = nums[0];
        for(int i = 1; i < nums.length ; i++){
            list[i] = list[i-1] + nums[i];
        }
        return list;
    }
}


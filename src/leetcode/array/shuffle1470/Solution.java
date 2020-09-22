package leetcode.array.shuffle1470;
//O(n)
//新数组交叉放入值
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[nums.length];
        int index = 0;
        for(int i = 0; i < n ; i++){
            array[index++] =nums[i];  //**
            array[index++] = nums[n+i];  //**减少运算
        }
        return array;
    }
}
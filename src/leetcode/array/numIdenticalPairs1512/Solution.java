package leetcode.array.numIdenticalPairs1512;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum = 0;
        for(int i = 1; i < nums.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(nums[i] == nums[j]){
                    sum++;
                }
            }
        }
        return sum;

    }
}
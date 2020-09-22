package leetcode.array.decompressRLElist1313;

public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length ; i+=2){
            sum += nums[i];
        }
        int[] list = new int[sum];
        sum = 0;
        for(int i = 0 ; i < nums.length ; i+=2){
            for(int j = 0; j < nums[i]; j++){
                list[sum] = nums[i+1];
                sum++;
            }
        }
        return list;
    }
}
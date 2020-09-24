package leetcode.array.findUnsortedSubarray581;

import java.util.Arrays;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1)return 0;
        int[] clone = nums.clone();
        Arrays.sort(nums);
        int start = 0, end = nums.length -1 ;
        boolean s = true , e = true;
        for(int i = 0 ; start<=end && i <nums.length ; i++){
            if((nums[i] == clone[i]) && s == true){
                start++;
            }else{
                s = false;
            }
            if((nums[nums.length-i-1] == clone[nums.length-i-1]) && e == true && start <= end){
                end--;
            }else{
                e = false;
            }
        }
        return end - start +1;
    }
}
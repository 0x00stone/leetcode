package leetcode.array.checkPossibility665;

class Solution {
    public boolean checkPossibility(int[] nums) {
        int flags = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                if(flags >= 1)
                    return false;
                flags++;
                if (i-1 >=0 && nums[i-1] > nums[i+1]){
                    nums[i+1] = nums[i];
                }else{
                    nums[i] = nums[i+1];
                }
            }
        }
        return true ;
    }
}
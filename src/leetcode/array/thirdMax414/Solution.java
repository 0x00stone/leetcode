package leetcode.array.thirdMax414;

public class Solution {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int sum = nums.length;
        boolean flags = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE && flags == false) {
                flags = true;
                sum++;
            }
            if (nums[i] == first || nums[i] == second || nums[i] == third) {
                sum--;
                continue;
            }
            if (nums[i] >= first) {
                third = second != Integer.MIN_VALUE ? second : Integer.MIN_VALUE;
                second = first != Integer.MIN_VALUE ? first : Integer.MIN_VALUE;
                first = nums[i];
                continue;
            } else if (nums[i] >= second) {
                third = second != Integer.MIN_VALUE ? second : Integer.MIN_VALUE;
                second = nums[i];
                continue;
            } else if (nums[i] >= third) {
                third = nums[i];
                continue;
            }
        }
        return sum <= 2 ? first : third;
    }
}

package leetcode.array.pivotIndex724;

public class demo {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};//3
        int[] nums2 = {1, 2, 3};//-1
        int[] nums3 = {-1, -1, -1,-1,-1,0};//2

        Solution s = new Solution();
        System.out.println(s.pivotIndex(nums3));
        System.out.println(s.pivotIndex(nums1));
        System.out.println(s.pivotIndex(nums2));
    }
}

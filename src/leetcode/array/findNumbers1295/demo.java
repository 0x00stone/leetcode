package leetcode.array.findNumbers1295;

public class demo {
    public static void main(String[] args) {
        int[] nums1 = {12,345,2,6,7896};//2
        int[] nums2 = {555,901,482,1771};//1

        Solution s = new Solution();
        System.out.println(s.findNumbers(nums1));
        System.out.println(s.findNumbers(nums2));
    }
}

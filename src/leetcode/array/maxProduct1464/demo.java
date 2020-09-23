package leetcode.array.maxProduct1464;

public class demo {
    public static void main(String[] args) {
        int[] nums3 = {3,7}; //12
        int[] nums1 = {3,4,5,2} ;//12
        int[] nums2 = {1,5,4,5} ; // 16


        Solution s = new Solution();
        System.out.println(s.maxProduct(nums3));
        System.out.println(s.maxProduct(nums1));
        System.out.println(s.maxProduct(nums2));

    }
}

package leetcode.array.checkPossibility665;

public class demo {
    public static void main(String[] args) {
        int[] nums1 = {4,2,3}; //true
        int[] nums2 = {4,2,1}; //false
        int[] nums3 = {4,2,3}; //true
        int[] nums4 = {3,4,2,3} ; //false;

        Solution s = new Solution();
        System.out.println(s.checkPossibility(nums1));
        System.out.println(s.checkPossibility(nums2));
        System.out.println(s.checkPossibility(nums3));
        System.out.println(s.checkPossibility(nums4));
    }
}
//4.2.3
//3.4.2.3
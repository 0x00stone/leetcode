package leetcode.array.decompressRLElist1313;

public class demo {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};//[2,4,4,4]
        int[] nums2 = {1,1,2,3};//[1,3,3]

        Solution s = new Solution();
        for(int i : s.decompressRLElist(nums1)){
            System.out.print(i);
        }
        System.out.println();
        for(int i : s.decompressRLElist(nums2)){
            System.out.print(i);
        }
    }
}

package leetcode.array.validMountainArray941;

public class demo {
    public static void main(String[] args) {
        int[] arr1 = {2,1};//false
        int[] arr2 = {3,5,5};//false
        int[] arr3 = {0,3,2,1};//true

        Solution s = new Solution();
        System.out.println(s.validMountainArray(arr1));
        System.out.println(s.validMountainArray(arr2));
        System.out.println(s.validMountainArray(arr3));
    }
}

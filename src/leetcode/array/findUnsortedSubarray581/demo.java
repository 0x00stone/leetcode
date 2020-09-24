package leetcode.array.findUnsortedSubarray581;

public class demo {
    public static void main(String[] args) {
        int[] arr4 = {1,2,0,3,4,5,6,7,8,9};//3
        int[] arr0 = {1,2,3,3,3};//0
        int[] arr1 =  {2, 6, 4, 8, 10, 9, 15};//5
        int[] arr2 = {1,2,3,4};//0
        int[] arr3 = {2,1};//0

        Solution s= new Solution();
        System.out.println(s.findUnsortedSubarray(arr4));
        System.out.println(s.findUnsortedSubarray(arr3));
        System.out.println(s.findUnsortedSubarray(arr0));
        System.out.println(s.findUnsortedSubarray(arr1));
        System.out.println(s.findUnsortedSubarray(arr2));
    }
}

package leetcode.array.sumOddLengthSubarrays1588;

public class demo {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,5,3};  //58
        int[] arr2 = {1,2,3} ; //3 //12
        int[] arr3 = {10,11,12}; //66

        Solution2 s = new Solution2();
        System.out.println(s.sumOddLengthSubarrays(arr1));
        System.out.println(s.sumOddLengthSubarrays(arr2));
        System.out.println(s.sumOddLengthSubarrays(arr3));
    }
}

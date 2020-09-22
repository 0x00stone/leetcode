package leetcode.array.sumOddLengthSubarrays1588;
//O(n2)
public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for( int i = 0 ; i < arr.length ; i++){
            for (int j = 1 ; j+i <= arr.length ; j += 2 ){
                for( int k = 0; k < j ; k ++){
                    sum+=arr[i+k];
                }
            }
        }
        return sum;
    }
}
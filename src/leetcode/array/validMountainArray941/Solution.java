package leetcode.array.validMountainArray941;

public class Solution {
    public boolean validMountainArray(int[] A) {
        int max = Integer.MIN_VALUE;
        int max_point = 0;
        for(int i = 0 ; i < A.length ; i++) {
            if (A[i] > max){
                max = A[i];
                max_point = i;
            }
        }

        for(int j = 0 ; j < max_point ; j++){
            if(A[j] >= A[j+1] || A[j] == max)
                return false;
        }

        for(int j = max_point ; j < A.length-1 ; j++) {
            if (A[j] <= A[j + 1] || ((A[j] == max) && (j != max_point)))
                return false;
        }
        if(max_point == 0 || max_point == A.length-1)return false;
        return true;
    }
}
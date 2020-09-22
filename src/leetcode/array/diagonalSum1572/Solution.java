package leetcode.array.diagonalSum1572;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        if(length == 1) return mat[0][0];
        int sum = 0;
        for(int i = 0 ; i <length ; i++){
            sum += mat[i][i] + mat[i][length - i -1];
        }
        if(mat.length % 2 == 1) sum -= mat[length / 2][length / 2] ;
        return sum;
    }
}
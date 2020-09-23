package leetcode.array.minTimeToVisitAllPoints1266;

//{{1,1},{3,4},{-1,0}}
public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for(int i = 0;i < points.length-1 ; i++){
            sum += Math.max(Math.abs(points[i+1][0] - points[i][0]) , Math.abs(points[i+1][1] - points[i][1])) ;
        }
        return sum;
    }
}
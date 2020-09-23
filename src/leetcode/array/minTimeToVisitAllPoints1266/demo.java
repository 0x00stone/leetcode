package leetcode.array.minTimeToVisitAllPoints1266;

public class demo {
    public static void main(String[] args) {
        int[][] points1 = {{1,1},{3,4},{-1,0}};  //7
        int[][] points2 = {{3,2},{-2,2}};   //5

        Solution s = new Solution();
        System.out.println(s.minTimeToVisitAllPoints(points1));
        System.out.println(s.minTimeToVisitAllPoints(points2));
    }
}

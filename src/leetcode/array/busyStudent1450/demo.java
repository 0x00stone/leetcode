package leetcode.array.busyStudent1450;

public class demo {
    public static void main(String[] args) {
        int[] startTime1 = {1,2,3}, endTime1 = {3,2,7};
        int queryTime1 = 4 ;//1
        int[] startTime2 = {4}, endTime2 = {4};
        int queryTime2 = 4 ;//1
        int[] startTime3 = {4}, endTime3 = {4};
        int queryTime3 = 5 ;//0
        int[] startTime4 = {1,1,1,1}, endTime4 = {1,3,2,4};
        int queryTime4 = 7 ;//0
        int[] startTime5 = {9,8,7,6,5,4,3,2,1}, endTime5 = {10,10,10,10,10,10,10,10,10};
        int queryTime5 = 5 ;//5

        Solution s = new Solution();
        System.out.println(s.busyStudent(startTime1,endTime1,queryTime1));
        System.out.println(s.busyStudent(startTime2,endTime2,queryTime2));
        System.out.println(s.busyStudent(startTime3,endTime3,queryTime3));
        System.out.println(s.busyStudent(startTime4,endTime4,queryTime4));
        System.out.println(s.busyStudent(startTime5,endTime5,queryTime5));
    }
}

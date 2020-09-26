package leetcode.array.SubrectangleQueries1476;

public class demo {
    public static void main(String[] args) {
        int[][]arr1_1 = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
        int[] arr1_2 = {0,2} , arr1_3 = {0,0,3,2,5} , arr1_4 = {0,2} , arr1_5 = {3,1}, arr1_6 = {3,0,3,2,10};
        int[] arr1_7 = {3,1}, arr1_8 = {0,2};
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(arr1_1);

        System.out.println(subrectangleQueries.getValue(arr1_2[0] , arr1_2[1])); // 返回 1
        subrectangleQueries.updateSubrectangle(arr1_3[0] , arr1_3[1] , arr1_3[2] , arr1_3[3] , arr1_3[4]);

        System.out.println(subrectangleQueries.getValue(arr1_4[0] , arr1_4[1]));; // 返回 5
        System.out.println(subrectangleQueries.getValue(arr1_5[0] , arr1_5[1]));; // 返回 5
        subrectangleQueries.updateSubrectangle(arr1_6[0] , arr1_6[1] , arr1_6[2] , arr1_6[3] , arr1_6[4]);

        System.out.println(subrectangleQueries.getValue(arr1_7[0] , arr1_7[1]));; // 返回 10
        System.out.println(subrectangleQueries.getValue(arr1_8[0] , arr1_8[1]));; // 返回 5


    }
}

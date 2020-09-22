package leetcode.array.diagonalSum1572;

public class demo {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},
                    {4,5,6},
                    {7,8,9}}; //25

        int[][] mat2 = {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}}; //8

        int[][] mat3 = {{5}};

        Solution s = new Solution();
        System.out.println(s.diagonalSum(mat1));
        System.out.println(s.diagonalSum(mat2));
        System.out.println(s.diagonalSum(mat3));

    }
}

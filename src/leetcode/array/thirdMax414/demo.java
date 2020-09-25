package leetcode.array.thirdMax414;

public class demo {
    public static void main(String[] args) {
        int[] num1 = {3, 2, 1};
        int[] num2 = {1, 2};
        int[] num3 = {2, 2, 3, 1};

        Solution2 s = new Solution2();
        System.out.println(s.thirdMax(num3));//1
        System.out.println(s.thirdMax(num2));//2
        System.out.println(s.thirdMax(num1));//1
    }
}

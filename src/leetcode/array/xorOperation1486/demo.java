package leetcode.array.xorOperation1486;

public class demo {
    public static void main(String[] args) {
        int n1 = 5, start1 = 0; //8
        int n2 = 4, start2 = 3; //8
        int n3 = 1, start3 = 7; //7
        int n4 = 10, start4 = 5; //2

        Solution s = new Solution();
        System.out.println(s.xorOperation(n1,start1));
        System.out.println(s.xorOperation(n2,start2));
        System.out.println(s.xorOperation(n3,start3));
        System.out.println(s.xorOperation(n4,start4));
    }
}

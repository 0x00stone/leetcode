package leetcode.array.findPairs532;

public class demo {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 1, 5};
        int k1 = 2; //2
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 1; //4
        int[] arr3 = {1, 3, 1, 5, 4};
        int k3 = 0; //1
        int[] arr0 = {1,1,1,1,1};
        int k0 = 0;

        Solution s = new Solution();
        System.out.println(s.findPairs(arr0,k0));
        System.out.println(s.findPairs(arr1 , k1));
        System.out.println(s.findPairs(arr2 , k2));
        System.out.println(s.findPairs(arr3 , k3));
    }
}

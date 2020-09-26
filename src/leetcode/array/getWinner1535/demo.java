package leetcode.array.getWinner1535;

public class demo {
    public static void main(String[] args) {
        int[] arr1 = {2,1,3,5,4,6,7};
        int k1 = 2;//5

        int[] arr2 = {3,2,1};
        int k2 = 10;//3

        int[] arr3 = {1,9,8,2,3,7,6,4,5};
        int k3 = 7;//9

        int[] arr4 = {1,11,22,33,44,55,66,77,88,99};
        int k4 = 1000000000;//99

        Solution s = new Solution();
        System.out.println(s.getWinner(arr1 , k1));
        System.out.println(s.getWinner(arr2 , k2));
        System.out.println(s.getWinner(arr3 , k3));
        System.out.println(s.getWinner(arr4 , k4));
    }
}

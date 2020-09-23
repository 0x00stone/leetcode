package leetcode.array.countGoodTriplets1534;

public class demo {
    public static void main(String[] args) {
        int[] arr3 = {7,3,7,3,12,1,12,2,3};
        int a3 = 8 , b3 = 5 , c3 = 1; //12

        int[] arr1 = {3,0,1,1,9,7};
        int a1 = 7, b1 = 2, c1 = 3;//4

        int[] arr2 = {1,1,2,2,3};
        int a2 = 0, b2 = 0, c2 = 1;//0


        Solution s = new Solution();
        System.out.println(s.countGoodTriplets(arr3 , a3 , b3 , c3));
        System.out.println(s.countGoodTriplets(arr1 , a1 , b1 , c1));
        System.out.println(s.countGoodTriplets(arr2 , a2 , b2 , c2));
    }
}

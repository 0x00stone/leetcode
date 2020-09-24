package leetcode.array.canPlaceFlowers605;

public class demo {
    public static void main(String[] args) {
        int[] flowerbed1 = {1,0,0,0,0,1};
        int n1 = 2 ;//false

        int[] flowerbed2 = {1,0,0,0,1};
        int n2 = 2;//False

        Solution2 s = new Solution2();
        System.out.println(s.canPlaceFlowers(flowerbed1,n1));
        System.out.println(s.canPlaceFlowers(flowerbed2,n2));
    }
}

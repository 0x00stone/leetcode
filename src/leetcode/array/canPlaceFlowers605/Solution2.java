package leetcode.array.canPlaceFlowers605;


public class Solution2 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int sum = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed[1] == 0) {
                        flowerbed[0] = 1;
                        flowerbed[1] = 1;
                        sum++;
                    }

                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i - 1] = 1;
                        flowerbed[i] = 1;
                        flowerbed[i + 1] = 1;
                        sum++;
                    }

            }

        }
        return sum > n ? true : false;
    }
}

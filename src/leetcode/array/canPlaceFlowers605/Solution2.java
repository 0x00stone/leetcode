package leetcode.array.canPlaceFlowers605;


public class Solution2 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if(flowerbed[0] == 0)return true ;
            else return n == 1 ? false : true ;
        }
        int sum = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if(sum >= n)return true;
                if (i == 0) {
                    if (flowerbed[1] == 0)
                    {
                        flowerbed[0] = 1;
                        sum++;
                    }
                }else if(i == flowerbed.length-1) {
                        if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] ==0)
                            sum++;
                }else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        sum++;
                    }

            }

        }
        return sum >= n ? true : false;
    }
}

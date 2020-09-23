package leetcode.array.canPlaceFlowers605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int space = 0;
        int sum = 0;
        Boolean flags = false;
        int[] black = new int[flowerbed.length];
        if(flowerbed[0] == 0) {
            if (flowerbed[1] == 0)
                space++;
            else
                black[0] = 1;
            flags = true;

        }
         else{
            black[0] = 1;
            black[1] = 1;
         }

         if(flowerbed[flowerbed.length-1] ==1){
             black[flowerbed.length -1] =1;
             black[flowerbed.length -2] = 1;
         }


        for(int i = 1; i < flowerbed.length -1 ; i++){
            if(flowerbed[i] == 1){
                black[i-1] = 1;
                black[i] = 1;
                black[i+1] = 1;
            }
        }

        for(int i = 0; i < black.length ; i++){
            if(flags){
                if(black[i]==0){
                    space++;
                }else{
                    flags = false;
                    sum = (space+1)/2;
                    space = 0;
                }
            }
        }

        return sum > n ? true : false;
    }
}
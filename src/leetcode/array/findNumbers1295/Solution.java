package leetcode.array.findNumbers1295;

class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for(int i :nums) {
            sum += find(i,10);
        }
        return sum;
    }

    int find (int number , int divisor){
        number /= divisor ;
        if(number > 0 && number < 10)
            return 1;
        else if(number >= 10)
            return find(number, 100);
        return 0;
    }
}
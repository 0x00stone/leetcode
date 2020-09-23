package leetcode.array.findNumbers1295;

class Solution2 {
    public int findNumbers(int[] nums) {
       int sum = 0;
       for(int i : nums){
           String temp = i+"";
            if(temp.length()%2 == 0){
                sum++;
            }
       }
       return sum;
    }
}


package leetcode.array.sumOddLengthSubarrays1588;
//O(n)
//dp[i] = dp[i - 1] - 以第i-1元素结尾的奇子数组的个数 + 以第i元素开头的奇子数组的个数;
//int[] arr1 = {1,4,2,5,3};  //58
public class Solution2 {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        if (len == 1) return arr[0];
        int[] dp = new int[len];
        dp[0] = (len + 1)/2 ;
        for (int i = 1; i < len; i++) {
            dp[i] = dp[i - 1] - (i + 1)/2 + (len - i + 1)/2;
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans += dp[i] * arr[i];
        }

        return ans;

    }
}

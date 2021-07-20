/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sum1=0;
        int n = nums.length;
        for(int i=1;i<=n;i++){
            sum=sum+nums[i-1];
            sum1=sum1+i;
        }
        return sum1-sum;
    }
}
// @lc code=end


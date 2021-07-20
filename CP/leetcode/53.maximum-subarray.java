/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum = nums[0];
        int currsum = nums[0];
        for(int i = 1;i < n ;i++){
            currsum = Math.max(currsum+nums[i],nums[i]);
            if(currsum> maxsum)maxsum=currsum;
        }
        return maxsum;
    }
}
// @lc code=end


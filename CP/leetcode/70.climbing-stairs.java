/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int ans = 1;
        int prev = 0;
        
        for(int i=1;i<=n;i++){
            int sum=ans+prev;
            prev = ans;
            ans=sum;
        }
        return ans;
    }
}
// @lc code=end


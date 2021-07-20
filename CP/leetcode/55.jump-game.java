/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        boolean ans = true;
        int n = nums.length;
        int i =1;
        for(; i<n-1 ;){
            
            i = i+nums[i];
        }
        if(i==n-1) return ans;
        else{
            ans=false;
            return ans;
        }
    }
}
// @lc code=end


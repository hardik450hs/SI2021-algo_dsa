/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i] =1;
        }
        int prod = 1;
        for(int i=0;i<n;i++){
            ans[i] = prod;
            prod = prod * nums[i];
        }
        prod = 1;
        for(int i =n-1;i>=0;i--){
            ans[i] = ans[i] * prod;
            prod = nums[i] * prod;
        }
        return ans;
    }
}
// @lc code=end


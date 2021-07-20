/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int n = 0,l=0,r=nums.length-1;
        while(l<=r){
            n = (l+r)/2;
            if(target == nums[n]){
                return n;
            }
            if(target>nums[n]) l = n+1;
            else r= n-1;
        }
        return -1;
    }
}
// @lc code=end


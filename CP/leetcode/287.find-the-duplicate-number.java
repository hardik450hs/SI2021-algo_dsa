/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        HashSet<Integer> h = new HashSet<>();
        // int n = nums.length;
        for(int i : nums){
            if(!h.contains(i))h.add(i);
            else ans = i;
        }
        
        return ans;
    }
}
// @lc code=end


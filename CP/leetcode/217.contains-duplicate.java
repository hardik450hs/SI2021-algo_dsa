/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        if(h.size()!=nums.length) return true;
        else return false;
    }
}
// @lc code=end


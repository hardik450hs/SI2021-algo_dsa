/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            if(!s.contains(i)) s.add(i);
            else l.add(i);
        }
        return l;
    }
}
// @lc code=end


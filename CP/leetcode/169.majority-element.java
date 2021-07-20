/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        if(n==1)return nums[0];
        int count = 1;
        for(int i=1;i<n;i++){
            
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{count =1;}
            if(count>n/2) return nums[i];
        }
        return 0;
    }
}
// @lc code=end


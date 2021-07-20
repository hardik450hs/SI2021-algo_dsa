/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> L = new ArrayList<>();
        int n = nums.length;
       for(int i = 0 ;i <n;i++){
           int j = Math.abs(nums[i])-1;
           if(nums[j]>0) nums[j]=nums[j]*-1;
       }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                L.add(i+1);
            }
        }
        
        return L;
    }
    // time complexity = O(n)
// space = O(1)
}

// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         List<Integer> L = new ArrayList<>();
//         int n = nums.length;
//         HashSet<Integer> h = new HashSet<>();
//         for(int i : nums){
//             h.add(i);
//         }
//         for(int i = 1 ;i<=n;i++){
//             if(!h.contains(i)){
//                 L.add(i);
//             }
//         }
        
        
//         //time complexity O(n)
//         //space O(n)
//         return L;
//     }
// }
// @lc code=end


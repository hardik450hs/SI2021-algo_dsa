/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = mergeNums(nums1, nums2);
        int mid = nums.length / 2;
        return nums.length % 2 == 0 ? (double) (nums[mid - 1] + nums[mid]) / 2 : nums[mid];
    }

    private int[] mergeNums(int[] nums1, int[] nums2) {
        int[] mergeNums = new int[nums1.length + nums2.length];
        int idx1 = 0;
        int idx2 = 0;
        for (int idx = 0; idx < mergeNums.length; idx++) {
            if (idx1 < nums1.length && (idx2 >= nums2.length || nums1[idx1] <= nums2[idx2])) {
                mergeNums[idx] = nums1[idx1];
                idx1++;
            } else if (idx2 < nums2.length && (idx1 >= nums1.length || nums1[idx1] > nums2[idx2])) {
                mergeNums[idx] = nums2[idx2];
                idx2++;
            }
        }
        return mergeNums;
    }
}
// @lc code=end

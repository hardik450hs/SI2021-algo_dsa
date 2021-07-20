/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=0,l=0,r=arr.length-1;
            while(l<=r){
                n=(l+r)/2;
                if(arr[n]>arr[n+1]){
                    if(arr[n]>arr[n-1] ) return n;
                    else{
                        r=n-1;
                    }
                }
                else{
                    l=n+1;
                }
            }
        return n;
    }
}
// @lc code=end


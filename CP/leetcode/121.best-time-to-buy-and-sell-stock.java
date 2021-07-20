/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int minprice=prices[0];
        for(int i =0;i<n;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else if(prices[i]-minprice>max){
                max=prices[i]-minprice;
            }
        }
        return max;   
    }
}
// @lc code=end


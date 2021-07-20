/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x; 
        int rem;
        int sum = 0;
        while(x>0){    
            rem=x%10;    
            sum=(sum*10)+rem;    
            x=x/10;    
        }    
        if(temp==sum)    
            return true;    
        else    
            return false; 
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=744 lang=java
 *
 * [744] Find Smallest Letter Greater Than Target
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char a=letters[0];
        int i = 0;
        while(letters[i]<=target){
            if(i==letters.length-1){
                a=letters[0];
                break;
            }
            i++;
            a = letters[i];
            
        }
        return a;
    }
}
// @lc code=end


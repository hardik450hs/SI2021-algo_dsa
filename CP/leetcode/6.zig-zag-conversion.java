/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] ZigZag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        List<List<Character>> ls = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ls.add(new ArrayList<>());
        }
        int setSize = numRows + numRows - 2;
        int setIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int listIndex = setIndex;
            if (listIndex >= numRows) {
                listIndex = setSize - listIndex;
            }
            ls.get(listIndex).add(c);
            setIndex = (setIndex + 1)%setSize;
        }
        StringBuilder sb = new StringBuilder();
        for (List<Character> sub : ls) {
            for (char c : sub) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
// @lc code=end


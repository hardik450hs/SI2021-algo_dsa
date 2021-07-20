/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int rs = 0;
        int re = matrix.length-1;
        int cs = 0;
        int ce = matrix[0].length-1;
        while(rs<=re && cs <= ce){
            for( int c = cs ; c<=ce ;c++){
                l.add(matrix[rs][c]);
            }
            for(int r = rs +1;r <=re ;r++){
                l.add(matrix[r][ce]);
            }
            if(rs< re && cs < ce){
            for(int c = ce -1;c>cs;c--){
                l.add(matrix[re][c]);
            }
            for(int r = re ; r> rs;r--){
                l.add(matrix[r][cs]);
            }}
            cs++;
            ce--;
            rs++;
            re--;
        }
        return l;
    }
}
// @lc code=end


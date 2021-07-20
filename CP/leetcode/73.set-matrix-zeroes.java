/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        Set<Integer> r1 = new HashSet<>();
        Set<Integer> c1 = new HashSet<>();
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    r1.add(i);
                    c1.add(j);
                }
            }
        }
        for(int i=0;i<r;i++){
            if(r1.contains(i)){
                for(int j=0;j<c;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<c;j++){
            if(c1.contains(j)){
                for(int i = 0;i<r;i++){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
// @lc code=end


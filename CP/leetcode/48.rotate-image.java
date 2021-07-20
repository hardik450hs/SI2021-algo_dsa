/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int r= matrix.length;
        
        for(int i = 0 ; i<r ;i++){
            for(int j = i;j<r;j++){            
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i = 0 ; i<r ;i++){
            for(int j = 0;j<r/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][r-j-1];
                matrix[i][r-j-1] = temp;
            }
        }
   
    }
}
// @lc code=end


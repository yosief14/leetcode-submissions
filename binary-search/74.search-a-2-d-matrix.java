import java.util.Arrays;
/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] flatList = Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray();

        int l = 0, r = flatList.length;

        while(l<r){
           int m = (l+r)/2;
           if(flatList[m] == target){
            return true;
           } 
           if( flatList[m] > target){
            r = m ;
           }else{
            l = m+1;
           }
        }
        return false;
    
    }
}
// @lc code=end


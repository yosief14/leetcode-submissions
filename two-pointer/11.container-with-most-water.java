/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        
       int res = 0, area; 
       int lft = 0;
       int rt = height.length -1;

       while (lft<rt){
        area = Math.min(height[lft], height[rt]) * (rt - lft);
        res = Math.max(res, area);
        if(height[lft] <= height[rt]){
            lft++;
        } else{
            rt --;
        }
       }
        
        return res;
    
        
    }
}
// @lc code=end


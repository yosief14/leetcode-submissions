
/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 * if l and r > 0 
 * min(l) 
 */
class Solution {
    public int trap(int[] height) {
        if(height.length <3){
            return 0;
        }
        int r = 0 , l = 1;
        int waterToAdd = 0, res = 0, level = 0;
        
        
        //find right start
        while(r < height.length){
            if(height[r] > 0){
                break;
            }
            r++;
        }
        
        l = r+1;

        while (l < height.length) {
            level = Math.min(height[l], height[r]);
            waterToAdd+= Math.min(height[l] - level,0); 
            //boundry found
            if(l >= r){
                res+=waterToAdd;
                waterToAdd = 0;
                r = l;
            }
            l++;
        }
        return res;
        
    }
}

// @lc code=end

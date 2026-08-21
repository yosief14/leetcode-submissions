
/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 * if l and r > 0 
 * min(l) 
 */
class Solution {
    public int trap(int[] height) {
       int [] prefix = new int[height.length]; 
       int [] postfix = new int[height.length]; 
       int leftMax = 0;
       int rightMax =0;
       int reverseI = height.length -1;
       int res = 0;
       
       for(int i = 0 ; i< height.length; i++){
        rightMax = Math.max(height[reverseI-i],  rightMax);
        leftMax = Math.max(height[i], leftMax);
        prefix[i] = leftMax;
        postfix[reverseI - i] = rightMax;
       }
       postfix[height.length] = 0;
       prefix[0] = 0;
       
       for (int i = 0 ; i < height.length; i++){
        int resToAdd = Math.min(prefix[i], postfix[i]) - height[i]; 
        res += Math.max(resToAdd, 0);
       }
       
       
       return res; 
    }
}
/*
         [0,2,0,3,1,0,1,3,2,1]
   prefix[0,2,2,3,3,3,3,3,3,3]
   postfi[3,3,3,3,3,3,3,3,2,1]
   
   0 + (2 - 2 ) + (2-0) + (3-3) + (3-1) + (3-0) +(3-3) + (2-2) + (0) 
    (2-0)  + (3-1) + (3-0)  
    2 + 2 + 3 = 7
 */
// @lc code=end

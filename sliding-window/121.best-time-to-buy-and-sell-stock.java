/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int r = 0;
        int maxProfit = 0;
       for(int l = 1 ; l < prices.length ; l++){
         
         int profit =   prices[l] - prices[r] ;
         maxProfit = Math.max(maxProfit, profit);
         if(prices[r] > prices[l]){
            r = l;
         }
       }
       return maxProfit;
           
    }
}
// @lc code=end


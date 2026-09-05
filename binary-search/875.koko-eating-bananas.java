/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = -1;
        int pileCount = 0;

        for (int p : piles) {
            pileCount += p;
            maxPile = Math.max(p, maxPile);
        }
        int l = (int) Math.ceil((double) pileCount / h);
        int r = maxPile;
        int k = h;

        while (l <= r) {
            int hours = 0;
            int m = (l + r) / 2;
            for (int p : piles) {
                hours += Math.ceil((double) p / m);
            }

            if (hours <= h) {
                k = Math.min(m, k);
                r = m - 1;
            } else if (hours > h) {
                l = m + 1;
            }
        }
        System.out.println(k);
        return k;

    }

    public static void main(String[] args) {
        int[] piles_1 = new int[] { 1, 4, 3, 2 };
        int[] piles_2 = new int[] { 5, 3, 5, 4 };
        int[] piles_3 = new int[] { 5, 5, 5, 5, 22 };
        int[] piles_4 = new int[] { 25, 10, 23, 4 };
        int[] piles_5 = new int[] { 1, 2 };

        new Solution().minEatingSpeed(piles_5, 3);
    }
}
// @lc code=end
//
/*

*/

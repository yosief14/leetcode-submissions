/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (target == nums[m]) {
                return m;
            }

            if (nums[l] <= nums[m]) {
                if (nums[l] > target || target > nums[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                if (target < nums[m] || target > nums[r]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 5, 6, 0, 1, 2 };
        int target_1 = 1;
        int target_2 = 4;
                                            
        int[] nums_1 = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int target_3 = 0;
        int target_8 = 4;

        int[] nums_2 = new int[] { 5, 1, 3 };
        int target_4 = 5;

        int[] nums_3 = new int[] { 3, 1 };
        int target_5 = 1;

        int[] nums_4 = new int[] { 3, 5, 1 };
        int target_6 = 1;

        new Solution().search(nums_4, 3);
    }

}
// @lc code=end

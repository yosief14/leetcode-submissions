/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        // boolean isSameNode = p.val == q.val;

        return p.val == q.val && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);

    }

    public static void main(String[] args) {

        // Add a test case, then Run/Debug this file
    }
}

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

}
// @lc code=end

/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
 */

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean dfs(TreeNode root, int left, int right) {
        if (root == null)
            return true;

        if (!(left < root.val && root.val < right)) {
            return false;
        }

        return dfs(root.left, left, root.val) && dfs(root.right, root.val, right);

    }

    public static void main(String[] args) {
        // Add a test case, then Run/Debug this file
        //
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

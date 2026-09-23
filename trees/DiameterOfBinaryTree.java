/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
 */

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode root, int[] res) {
        if (root == null)
            return 0;

        int leftMost = dfs(root.left, res);
        int rightMost = dfs(root.right, res);
        res[0] = Math.max(res[0], leftMost + rightMost);
        return 1 + Math.max(leftMost, rightMost);

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
// @lc code=end

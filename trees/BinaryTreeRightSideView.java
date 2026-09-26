
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
 */

public class BinaryTreeRightSideView {
    private List<Integer> inView = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return inView;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null)
            return;

        if (inView.size() == depth) {
            inView.add(root.val);
        }

        dfs(root.right, depth + 1);
        dfs(root.left, depth + 1);
    }

    public static void main(String[] args) {
        // Add a test case, then Run/Debug this file
    }
}

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

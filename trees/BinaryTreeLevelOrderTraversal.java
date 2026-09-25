/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        dfs(levels, root, 0);
        return levels;

    }

    private void dfs(List<List<Integer>> levels, TreeNode root, int depth) {
        if (root == null)
            return;

        if (levels.size() == depth) {
            levels.add(new ArrayList<>());
        }
        levels.get(depth).add(root.val);
        dfs(levels, root.left, depth + 1);
        dfs(levels, root.right, depth + 1);

    }

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
    public List<List<Integer>> levelOrder(TreeNode root) {
    }
}
// @lc code=end

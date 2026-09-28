/*
 * @lc app=leetcode id=1448 lang=java
 *
 * [1448] Count Good Nodes in Binary Tree
 */

public class CountGoodNodesInBinaryTree {
    private int count = 0;
    public int goodNodes(TreeNode root) {
       dfs(root, root.val); 
       return count;
    }
    private void dfs(TreeNode root, int largest){
        if (root == null) return;
        if(largest <= root.val){
            largest = root.val;
            count++;
        }
        dfs(root.left,largest);
        dfs(root.right,largest);
        
    }

    public static void main(String[] args) {
        // Add a test case, then Run/Debug this file
    }
}

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
}
// @lc code=end


/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
 */

public class InvertBinaryTree {

  private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

  }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        } 
        
        TreeNode invertedRoot = new TreeNode(root.val, root.left, root.right);
        
        if(invertedRoot.left == null && invertedRoot.right == null){
            return invertedRoot;
        }
        invertedRoot.left = invertTree(root.right);
        invertedRoot.right =  invertTree(root.left); 
        
        return invertedRoot;
    }    // Add a test case, then Run/Debug this file
    public static void main(String[] args) {

    }
}

// @lc code=start

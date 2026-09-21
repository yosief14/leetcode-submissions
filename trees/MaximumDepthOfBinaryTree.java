
import java.util.Stack;

/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        // Add a test case, then Run/Debug this file
    }
}

// @lc code=start
/**
 * Definition for a binary tree node.
  public class TreeNode {
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
 */
class Solution {

  public class TreeNode {
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
    public int maxDepth(TreeNode root) {
        record Entry (TreeNode node, int depth){};
        Stack<Entry> stack = new Stack<>();
        stack.push(new Entry(root, 1));
        int count = 0; 
        while(!stack.isEmpty()){
            Entry nodEntry = stack.pop();
            TreeNode node = nodEntry.node;
                        
            if(node.left!= null){
                stack.push(new Entry(node.left, (nodEntry.depth + 1)));
            }
            if(node.right!= null){
                stack.push(new Entry(node.right, nodEntry.depth + 1));
            }
            
            count = Math.max(count, nodEntry.depth);
        }
        return count;
    }
}
// @lc code=end


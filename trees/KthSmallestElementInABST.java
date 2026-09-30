
import java.util.Stack;

/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
 */

public class KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        int count = 0;
        TreeNode cur = root;
        
        while(cur != null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);         
                cur = cur.left;
            }
            cur = stack.pop(); 
            count++;
            if(count == k){
                return cur.val;
            }
            
            cur = cur.right;
        }
        return -1;
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


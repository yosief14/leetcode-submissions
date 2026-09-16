/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1;
        ListNode prev = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            if (l1 == null) {
                if (l2 != null) {
                    prev.next = l2;
                    l1 = l2;
                    l2 = null;
                } else {
                    prev.next = new ListNode(carry);
                    break;
                }
            }

            int sum = l1.val + (l2 == null ? 0 : l2.val) + carry;
            l1.val = sum % 10;
            carry = sum / 10;

            prev = l1;
            l1 = l1.next;
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return head;
    }
}
// @lc code=end

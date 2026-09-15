/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode next = head;
        int i = 0;
        while (i < n) {
            next = next.next;
            i++;
        }

        // System.out.println("start pos: " + prev.val + " " + next.val);
        while (next != null) {
            prev = prev.next;
            next = next.next;
        }

        // System.out.println("end pos: " + prev.val + " " + next);
        // System.out.println(prev.val);
        // System.out.println(next);
        // maybe I should be setting the ith node equal to the end
        // I need to set prev.next
        // land on ith node set it equal to the value after it next.next
        // Ineed 2 and 3 2.next = 3.next.
        // [4,5] n = 1 if prev = null
        prev.next = prev.next.next;

        return dummy.next;

    }
}
// @lc code=end

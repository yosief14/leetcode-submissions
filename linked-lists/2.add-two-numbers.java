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
        ListNode prevL1 = null, prevL2 = null;

        int counterL1 = 0;
        int counterL2 = 0;
        while (l1 != null) {
            ListNode temp = l1.next;
            l1.next = prevL1;
            prevL1 = l1;
            l1 = temp;
            counterL1++;
        }
        while (l2 != null) {
            ListNode temp = l2.next;
            l2.next = prevL2;
            prevL2 = l2;
            l2 = temp;
            counterL2++;
        }

        ListNode largerNums;
        ListNode smallerNums;
        if (counterL2 > counterL1) {
            largerNums = prevL2;
            smallerNums = prevL1;
        } else {
            largerNums = prevL1;
            smallerNums = prevL2;
        }

        ListNode returnVal = largerNums;
        int passThrough = 0;
        ListNode prevy = null;
        while (largerNums != null) {
            int numL1 = largerNums.val;
            int numL2 = smallerNums == null ? 0 : smallerNums.val;
            int sum = numL1 + numL2 + passThrough;

            passThrough = sum >= 10 ? 1 : 0;
            largerNums.val = sum % 10;
            System.out.println(" smallerNums.val: " + numL2 + " larger: " + numL1
                    + " large nums val:" + largerNums.val + " passthrough: " + passThrough);
            ListNode temp = largerNums.next;
            largerNums = largerNums.next;
            smallerNums = smallerNums == null ? null : smallerNums.next;
        }

        if (passThrough > 0) {
            ListNode add = new ListNode(passThrough);
            add.next = returnVal;
            returnVal = add;
        }
        ListNode prevRet = null;
        while (returnVal != null) {
            ListNode temp = returnVal.next;
            returnVal.next = prevRet;
            prevRet = returnVal;
            returnVal = temp;
        }
        return prevRet;

    }
}
// @lc code=end

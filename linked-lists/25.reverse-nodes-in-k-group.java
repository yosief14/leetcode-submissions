/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
 
        int counter = 0;

        ListNode start = head;
        while (head != null) {
            counter++;
            head = head.next;
        }
        head = start;
        //5 - 2 = 3 < 3
        boolean shouldBreakEarly = (counter - k) < k;
        System.out.println("should break: " + shouldBreakEarly + " counter: " + counter);
        counter = 0;

        ListNode prev = null;
        ListNode brkNode = head;
        while(head != null){
            if (counter > k && shouldBreakEarly ){
                return start;
            }
            if(counter == k){
                // System.out.printf("counter: %d, head: %d, prev: %d, brkNode: %d \n", counter, head.val, prev.val, brkNode.val);
                brkNode.next = head;
                start = prev;
                System.out.printf(" head: %d, prev: %d, brkNode.next: %d \n",  head.val, prev.next.val, brkNode.next.val);
                prev = head;
                head=head.next;
                // System.out.printf(" head: %d, prev: %d, brkNode.next: %d \n",  head.val, prev.next.val, brkNode.next.val);
                counter++;
                continue;
            }
            ListNode temp = head.next;
            head.next=prev;
            prev = head;
            head = temp;
            counter++;
        }
        return start;
           
    }
}
// @lc code=end


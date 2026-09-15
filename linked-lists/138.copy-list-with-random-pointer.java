/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node copy = new Node(0);
        Node start = copy;
        Node headStar = head;
        HashMap<Node, Node> list = new HashMap<>();
        while (head != null) {
            copy.next = new Node(head.val);
            copy = copy.next;
            list.put(head, copy);
            copy.random = head.random;
            head = head.next;
        }
        copy = start.next;

        while (copy != null) {
            copy.random = list.get(copy.random);
            copy = copy.next;
        }
        // list.forEach((k, v) -> System.out.println(" key: " + (k != null ?k.val : k) +
        // " val:"+v.val));

        return start.next;

    }
}
// @lc code=end

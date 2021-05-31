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
    public ListNode reverseList(ListNode head) {
        ListNode tempHead = null;
        ListNode origin = head;
        while (origin != null) {
            ListNode temp = origin.next;

            origin.next = tempHead;
            tempHead = origin;
            origin = temp;
        }

        return tempHead;

    }
}
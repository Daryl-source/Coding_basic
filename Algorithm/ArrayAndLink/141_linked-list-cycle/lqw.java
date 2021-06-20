/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * 链表如果有环,则使用快慢指针追赶,快慢指针一定相遇
     * 类似于操场的跑步追赶
     * 快指针一次走2步,慢指针走1步,如果存在环,则快指针一定会追上慢指针
     */
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;    
    }
}

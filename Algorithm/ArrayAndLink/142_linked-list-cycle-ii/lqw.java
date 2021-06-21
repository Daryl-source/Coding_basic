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
    public ListNode detectCycle(ListNode head) {
        /**
         * 先使用快慢指针判断有没有环,
         * 在环相遇的地方,重新放一个慢指针
         */
         if(head == null){
             return null;
         }

         ListNode fast = head;
         ListNode slow = head;

         while(fast.next != null && fast.next.next != null){
             fast = fast.next.next;
             slow = slow.next;
             if(fast == slow){
                ListNode slow2 = head;
                while(slow != slow2){
                    slow2 = slow2.next;
                    slow = slow.next;
                }
                return slow;
             }
         }

         return null;
    }
}

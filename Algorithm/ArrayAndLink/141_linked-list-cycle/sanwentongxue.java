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
    public boolean hasCycle(ListNode head) {
        /**
         * 环形链表的判断，首先想到了利用pos判断节点是否被访问过(需要保存遍历的节点，空间复杂度O(N)，不符合要求)。
         * 由此想到了经典的快慢指针，利用快指针追上慢指针的做法，或者快指针到达null，即可判断是否有环
         * Time complexity: O(n)
         * Space complexity: O(1)
         */
        if(head==null || head.next == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}

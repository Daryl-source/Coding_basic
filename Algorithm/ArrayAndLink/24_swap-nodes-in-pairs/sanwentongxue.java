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
    public ListNode swapPairs(ListNode head) {
        /**
         * 这里的递归可能不太好理解，需要画图具体走一下流程。两两交换很容易形成抽象的模型，本质其实都是一种操作。
         * 利用head去连接交换后的子链，需注意的就是递归时的参数，返回子链，head.next连接。
         * Time complexity: O(n)
         * Space complexity: O(1)
         */
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = head.next.next;
        ListNode pre = head.next;
        pre.next = head;
        head.next = swapPairs(last);
        return pre;
    }
}
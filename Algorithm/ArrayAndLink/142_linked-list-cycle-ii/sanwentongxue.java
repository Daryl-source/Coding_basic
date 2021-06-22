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
         * 最想想到的还是利用哈希表记录节点，很容易就能得到第一次入环形的节点，但是O(n)的空间复杂度。
         * 空间利用的少，还是需要双指针来做，没想出来，看题解还需要用数学抽象一下，学到了(T .T)
         * Time complexity: O(n)
         * Space complexity: O(n)
         */
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return head;
            } else {
                set.add(head);
                head = head.next;
            }
        }
        return null;
    }
}

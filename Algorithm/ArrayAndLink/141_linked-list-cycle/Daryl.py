# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        """
        Define two parameters(slow and fast) pointing the head node, loop the chain through the head node,
        the fast node go through two steps but the slow node only go through one step, if there is a cycle on this chain,
        those two nodes will meet each other, otherwise no cycle on this chain.
        Time complexity: O(n)
        Space complexity: O(1)
        :param head:
        :return:
        """
        if not head:
            return False
        slow = fast = head
        while slow and fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow is fast:
                return True
        return False

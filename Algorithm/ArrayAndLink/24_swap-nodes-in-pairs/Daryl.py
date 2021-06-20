# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution(object):
    def swapPairs(self, head):
        """
        Create a new head node, loop through the chain and reverse the each two nodes.
        Time complexity: O(n)
        Space complexity: O(1)
        :type head: ListNode
        :rtype: ListNode
        """
        new_head = ListNode()
        new_head.next = head
        current_head = new_head

        while head:
            next_node = head.next
            if not next_node:
                return new_head.next
            next_next_node = next_node.next
            current_head.next = next_node
            next_node.next = head
            head.next = next_next_node
            current_head = head
            head = next_next_node
        return new_head.next

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        Use two indicators pointing to two nodes which are the previous node and the current node, loop through the head node,
        change the previous direction to make the current node become the next node of the previous node, meanwhile, preserve
        the next node of the current node just in case of loss reference, at the end of the loop, the previous node is the newer head node.
        Time complexity: O(n)
        Space complexity: O(1)
        """
        if not head:
            return head
        pre_node = None
        current_node = head
        while current_node:
            next_node = current_node.next
            current_node.next = pre_node
            pre_node = current_node
            current_node = next_node
        return pre_node

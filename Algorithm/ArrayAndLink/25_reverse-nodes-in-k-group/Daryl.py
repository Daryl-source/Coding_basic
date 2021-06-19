# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution(object):
    def reverseKGroup(self, head, k):
        """
        Loop the chain through the head node, extract the each k nodes and revert them, meanwhile, preserve the previous
        node and tail node, combining together to crate a new chain.
        Time complexity: O(n)
        Space complexity: O(1)
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if k <= 1:
            return head
        # create a new head node
        new_head = ListNode()
        new_head.next = head
        current_head = new_head

        while head:
            # record the current node
            current_node = head
            for i in range(k - 1):
                head = head.next
                if not head:
                    return new_head.next
            # record the next node
            next_node = head.next
            head.next = None
            temp_head, temp_last_node = self.reverseList(current_node)
            current_head.next = temp_head
            current_head = temp_last_node
            head = next_node
            temp_last_node.next = head
        return new_head.next

    def reverseList(self, head):
        """
        Reverse the the current chain through the head node and return the new head, tail node of this chain
        :param head:
        :return: new head, tail node
        """
        pre_node = None
        last_node = head
        current_node = head
        while current_node:
            next_node = current_node.next
            current_node.next = pre_node
            pre_node = current_node
            current_node = next_node
        return pre_node, last_node

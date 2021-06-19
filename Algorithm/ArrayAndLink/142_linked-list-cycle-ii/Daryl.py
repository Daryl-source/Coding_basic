# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        Using a dict to preserve the each node on this chain, if the current node exists before, then this node is the
        entrance of cycle chain
        Time complexity: O(n)
        Space complexity: O(n)
        :type head: ListNode
        :rtype: ListNode
        """
        node_dict = {}
        current_node = head
        index = 0
        while (current_node):
            if current_node in node_dict:
                return current_node
            node_dict[current_node] = index
            current_node = current_node.next
            index += 1
        return None



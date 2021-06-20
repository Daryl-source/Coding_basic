/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func detectCycle(head *ListNode) *ListNode {

    if head == nil{
        return nil
    }

    fast, slow := head, head
    for fast.Next != nil && fast.Next.Next != nil {
        fast = fast.Next.Next
        slow = slow.Next
        if fast == slow{
            slow2 := head
            for slow != slow2{
                slow = slow.Next
                slow2 = slow2.Next
            }
            return slow
        }
    }
    return nil
}

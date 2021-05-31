import java.util.List;

public class 247 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reverseList(head);
    }

    public static ListNode reverseList(ListNode head) {

        ListNode tempHead = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = tempHead;
            tempHead = head;
            head = temp;
        }

        return tempHead;

    }

}

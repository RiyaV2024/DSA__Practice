public class ReverseLinkedList {
    public ListNode reverse(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }
        ListNode temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
        return reverse(head, prev);
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
}
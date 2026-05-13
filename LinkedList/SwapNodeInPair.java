package LinkedList;

class Solution {
    private void rev(ListNode start, ListNode end) {
        ListNode cur = start;
        ListNode prev = null;
        while (prev != end) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode start = head;
        ListNode end = head.next;
        // Remaining list
        ListNode ans = swapPairs(end.next);
        // Reverse current2 nodes
        rev(start, end);
        // Connect
        start.next = ans;
        return end;
    }
}

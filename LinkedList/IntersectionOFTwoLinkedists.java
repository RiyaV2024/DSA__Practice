class Solution {
public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
    if (head1 == null || head2 == null)
        return null;
    ListNode t1 = head1;
    ListNode t2 = head2;
    while (t1 != t2) {
        if (t1 == null)
            t1 = head2;
        else
            t1 = t1.next;
        if (t2 == null)
            t2 = head1;
        else
            t2 = t2.next;
    }
    return t1;
}
}
package LinkedList;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true; // cycle found
            }
            set.add(head);
            head = head.next;
        }
        return false; // no cycle
    }
}

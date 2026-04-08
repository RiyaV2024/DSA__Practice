package LinkedList;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class RemoveDuplicateFromList {
    class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
return head;
    }
}

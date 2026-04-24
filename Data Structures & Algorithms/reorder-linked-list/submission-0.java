/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        //find middle
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse second half
        ListNode second = slow.next;
        ListNode prev = null;
        slow.next  = null;  // breaking the linked list into two halves
        ListNode temp;
        while (second!=null){
           temp =second.next;
           second.next = prev;
           prev = second;
           second =temp;
        }
        ListNode first = head;
        second = prev;

        ListNode temp1;
        ListNode temp2;
        while(second!=null){
            temp1 = first.next;
            temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}

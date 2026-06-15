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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        ListNode curr=head.next.next;
        
        while(curr!=null && curr.next!=null){
            temp=temp.next;
            curr=curr.next.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
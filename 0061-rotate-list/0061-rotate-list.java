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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int len=1;
        if(k==0) return head;
        ListNode temp = head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        if(k%len==0) return head;
        k = k % len;
        temp.next = head; 
        int l = len - k;
        ListNode New = head;
        for (int i = 1; i < l; i++) {
            New = New.next;
        }
        ListNode newHead = New.next;
        New.next = null;

        return newHead;
        
        
        
    }
}
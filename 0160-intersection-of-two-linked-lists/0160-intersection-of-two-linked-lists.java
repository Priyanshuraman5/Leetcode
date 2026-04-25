/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int cntA = 0;
        ListNode currA = headA;
        while(currA!=null){
            cntA++;
            currA = currA.next;
        }
        int cntB = 0;
        ListNode currB = headB;
        while(currB!=null){
            cntB++;
            currB = currB.next;
        }
        int cntC = 0;
        if(cntA<cntB){
            cntC = cntB-cntA;
        }
        else{
            cntC = cntA-cntB;
        }
        currA = headA;
        currB = headB;
        for(int i=0;i<cntC;i++){
            if(cntA > cntB){
                currA = currA.next;
            }
            else if(cntA<cntB){
                currB = currB.next;
            }
            else {
                break;
            }
        }
        while(currA != currB){
            currA = currA.next;
            currB = currB.next;
        }
        return currA;

    }
}
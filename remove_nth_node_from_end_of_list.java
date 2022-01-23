// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //empty list or list with only one element
        if(head==null || head.next==null)
        {
            return null;
        }
        
        ListNode fst = head;
        ListNode slw = head;
        for(int i=0;i<=n;i++)
        {   
            //cond where head needs to be removed
            if(i==n && fst==null)
            {
                return head.next;
            }
            fst=fst.next;
        }
        while(fst!=null)
        {
            fst=fst.next;
            slw=slw.next;
        }
       
        //slow points to node before node that needs to be deleted
        slw.next=slw.next.next;
        
        return head;
    }
    
}

// https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        //if linked list has no element or 1 element 
        if(head==null || head.next==null)
        {
            return null;
        }
        
        ListNode fst = head;
        ListNode slw = head;
        
        //checking for cycle
        while(fst!=null && fst.next!=null)
        {
            fst=fst.next.next;
            slw=slw.next;
            if(fst==slw)
            {   
                break;
                
            }
            
            
        }
        
        //if linked list has no cycle return null
        if(fst==null || fst.next==null) return null; 
        
        //finding node which causes 
            slw=head;
            while(slw!=fst)
            {
                slw=slw.next;
                fst=fst.next;
            }
           
        
        
        return slw;
    }
}

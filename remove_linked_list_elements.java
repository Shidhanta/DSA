// https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int v) {
      //empty list  
      if(head==null)
        {
            return head;
        }
      //if head of list is target element
        while(head!=null && head.val==v)
        {
            head=head.next;
        }
      //check if whole list had only elements with val as target
        if(head==null)
           {
               return null;
           }
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null)
        {
            if(curr.val==v)
            {   
                //removing target value from list
                prev.next=curr.next;
                curr=prev.next;
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }
        }
        
        return head;
        
    }
}

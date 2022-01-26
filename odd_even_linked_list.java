// https://leetcode.com/problems/odd-even-linked-list/

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
    public ListNode oddEvenList(ListNode head) {
        //if no node exists
        if(head==null) return null;
        
        ListNode h_o = new ListNode(-1); //linked list head of odd values
        ListNode h_e = new ListNode(-2); //linked list head of even values
        ListNode t_o = h_o; 
        ListNode t_e = h_e;
        //tail for odd and even linked list is used to keep track of nodes where even and odd nodes need to be attached
        while(head!=null)
        {   
            //adding odd valued node
            t_o.next=head;
            head=head.next;
            t_o=t_o.next;
            //adding even valued node if list is not empty
            if(head!=null)
            {
                t_e.next=head;
                t_e=t_e.next;
                head=head.next;
            }
        }
        //joining even linked list to the end of the odd valued ll
        t_o.next=h_e.next;
        t_e.next=null;
        return h_o.next;
    }
}

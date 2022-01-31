// https://leetcode.com/problems/swap-nodes-in-pairs/

/*

    Create a dummy node whose next pointer will point to the current head.
    Now take a current node which will be used to traverse the list
    In each iteration, take two nodes, first = current.next and second = current.next.next.
    Point the next of first to the next of second which is actually the thirst node from the current.
    Link the pointers accordingly and at last return the dummy.next.


*/


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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode curr = dummy;
        while(curr!=null && curr.next!=null && curr.next.next!=null)
        {   
            ListNode first =curr.next;
            ListNode second = curr.next.next;
            curr.next=second;
            first.next=second.next;
            second.next = first;
            
        
            curr=curr.next.next;
        }
        return dummy.next;
    }
}

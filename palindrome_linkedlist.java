//https://leetcode.com/problems/palindrome-linked-list/

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
    public ListNode middle_elem(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        //fast.next == null is condition to get first middle elem
        //for even number of elements
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse( ListNode head)
    {
        ListNode curr=head;
        ListNode prev = null;
        ListNode ahead = null;
        while(curr!=null)
        {
            ahead = curr.next;
            curr.next = prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
    //find middle element
    //reverse half of the link list (here second half)
    //compare first and second half element by element
    public boolean isPalindrome(ListNode head) {
        ListNode midd = middle_elem(head);
        ListNode l1 = reverse(midd.next);
        ListNode l2 = head;
        while(l2!=null && l1!= null)
        {
            if(l1.val!=l2.val)
            {
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return true;
    }
}

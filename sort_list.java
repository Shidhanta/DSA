//https://leetcode.com/problems/sort-list/

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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode mid = middle_elem(head);
        ListNode ll2 = mid.next;
        mid.next=null;
        ListNode head1 = sortList(head);
        ListNode head2 = sortList(ll2);
        return merge_ll(head1,head2);
    }

    public ListNode middle_elem (ListNode head)
    {
        ListNode fst = head;
        ListNode slw = head;
        while(fst.next!=null && fst.next.next!=null)
        {
            fst=fst.next.next;
            slw=slw.next;
        }
        return slw;
    }
    public ListNode merge_ll(ListNode head1, ListNode head2)
    {
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while(head1!=null && head2!=null)
        {
            if(head1.val<=head2.val)
            {
                tail.next=head1;
                head1=head1.next;
            }
            else
            {
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        if(head1==null)
        {
            tail.next=head2;
        }
        else
        {
            tail.next=head1;
        }
        return head.next;
    }
    
}

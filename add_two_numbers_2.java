// https://leetcode.com/problems/add-two-numbers-ii/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        
        ListNode hd1 = reverse(l1);
        ListNode hd2 = reverse(l2);
        ListNode ans = new ListNode(-1);
        ListNode tail = ans;
        int carry =0;
        while(hd1!=null || hd2!=null || carry!=0)
        {   
            int sum = carry;
            sum+=hd1!=null?hd1.val:0;
            sum+=hd2!=null?hd2.val:0;
            
            int res = sum%10;
            carry = sum/10;
            ListNode n = new ListNode(res);
            tail.next=n;
            tail=tail.next;
            if(hd1!=null)
            {
                hd1=hd1.next;
            }
            if(hd2!=null)
            {
                hd2=hd2.next;
            }
            
        }
        
        ListNode hd = reverse(ans.next);
        return hd;
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev =null;
        ListNode ahd = null;
        while(curr!=null)
        {
            ahd = curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahd;
        }
        return prev;
    }
}

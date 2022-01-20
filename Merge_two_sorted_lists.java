//https://leetcode.com/problems/merge-two-sorted-lists/

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //dummy node(-1) to avoid null pointer exception  
        ListNode head= new ListNode(-1);
        ListNode tail = head;
        //if list 1 has less value we move tail of our ans linked list to list1 else to list 2
        //we will move the appropriate list by one (similar to merging two arrays using 2 pointer approach)
        //loop will break once one of the lists is completely traversed
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                tail.next=list1;
                list1=list1.next;
            }
            else
            {
                tail.next = list2;
                list2 = list2.next;
            }
            tail=tail.next;
        }
        //add the leftover list to the ans list
        if(list1==null)
        {
            tail.next=list2;
        }
        else
        {
            tail.next=list1;
        }
        //return the node after dummy node
        return head.next;
        
    }
}

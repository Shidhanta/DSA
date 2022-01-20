//https://leetcode.com/problems/linked-list-cycle/

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
    public boolean hasCycle(ListNode head) {
        ListNode fst = head;
        ListNode slw = head;
      //if while loop breaks, no loop , if slw and fst meet then there is def a cycle
        while(slw!= null && fst!=null && fst.next != null)
        {
            
                slw=slw.next;
                fst=fst.next.next;
                if(fst==slw)
                {
                    return true;
                }
        }
        
        return false;
    }
}

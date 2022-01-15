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
//Floyd Cycle detection algorithm- 
// If there is a cycle fast pointer and slow pointer will coincide 
public class linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        ListNode fst = head;
        ListNode slw = head;
        while(slw!= null && fst!=null && fst.next != null)
        {
            
                slw=slw.next; //slow pointer moving by one
                fst=fst.next.next; // fast pointer moving two list elements at a single go 
                if(fst==slw)
                {
                    return true;
                }
        }
        
        return false;
    }
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
        }
}
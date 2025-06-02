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
   ListNode  reverse(ListNode head)
    {
        ListNode current=head;
        ListNode prev=null;
        ListNode nextnode;
        while(current!=null)
        {
        nextnode=current.next;
        current.next=prev;
        prev=current;
        current=nextnode;
     
        }
  
         return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null &&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=reverse(slow);
        ListNode current1=head;
        ListNode current2=head2;
        while(current1!=null && current2!=null)
        {
            if(current1.val!=current2.val)
            {
                return false;
            }
            current1=current1.next;
            current2=current2.next;

        }
        return true;
        
    }
}
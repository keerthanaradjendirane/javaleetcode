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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int midval=count/2;
        ListNode mid=head;
        for(int i=0;i<midval;i++)
        {
            mid=mid.next;
        }
        ListNode secondhalf=reverse(mid);
        ListNode firsthalf=head;
        while(secondhalf!=null)
        {
            if(firsthalf.val!=secondhalf.val)
            {
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
            
        }
        return true;
        
    }
    
    ListNode reverse(ListNode head)
        {
            ListNode nextnode;
            ListNode prev=null;
            while(head!=null)
            {
            nextnode=head.next;
            head.next=prev;
            prev=head;
            head=nextnode; 
            }
            return prev;
           
        }
}
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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode dummy=head;
        int sum=0;
        while(head.next!=null)
        {
            sum+=head.val;
            head=head.next;
            //finding the sum between consecutive 0's
            if(head.val==0)
            {
                temp=temp.next;
                //Storing the sum value in the same linked list
                temp.val=sum;
                sum=0;
            }
        }
         temp.next=null;
         return dummy.next; 
    }
}
//http://leetcode.com/problems/linked-list-cycle-ii/
//time complexity: O(n)
//space complexity: O(1)
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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(fast== null || fast.next==null)
        {
            return null;
        }
        while(head!=slow)//if there is a cycle, then move the head pointer and slow pointer one step at a time until they meet, the point where they meet is the starting point of the cycle
        {
            head=head.next;
            slow=slow.next;
        }
        return head;
    }
}
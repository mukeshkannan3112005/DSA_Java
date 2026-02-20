//http://leetcode.com/problems/linked-list-cycle/
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
    public boolean hasCycle(ListNode head) {
        ListNode slow=head; //slow pointer moves one step at a time
        ListNode fast=head; //fast pointer moves two steps at a time
        while(fast!=null && fast.next!=null) //if fast pointer reaches null or fast.next is null, then there is no cycle
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)//if slow and fast pointers meet, then there is a cycle
            {
                return true;
            }
        }
        return false;
    }
}
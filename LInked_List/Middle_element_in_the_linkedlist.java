//https://leetcode.com/problems/middle-of-the-linked-list/description/
//time complexity:O(n)
//space complexity:O(1)
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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        //traverse the linked list using two pointers, one pointer moves one step at a time and the other pointer moves two steps at a time. When the fast pointer reaches the end of the linked list, the slow pointer will be at the middle of the linked list
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
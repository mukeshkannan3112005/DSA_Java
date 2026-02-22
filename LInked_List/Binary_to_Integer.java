//http:leetcode.com/problems/binary-number-in-a-linked-list/description/
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
    public int getDecimalValue(ListNode head) {
        int length=0;
        ListNode temp=head;
        //traversing the linked list to find the length of the linked list
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        int sum=0;
        ListNode dummy=head;
        //traversing the linked list again to find the sum of the binary number
        while(dummy!=null && length>=0)
        {
            length--;
            sum+=Math.pow(2,length)*dummy.val;
            dummy=dummy.next;
        }
        return sum;
    }
}
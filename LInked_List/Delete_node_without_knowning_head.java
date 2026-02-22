//http:leetcode.com/problems/delete-node-in-a-linked-list/description/
//time complexity:O(1)
//space complexity:O(1)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //change the value of the node to be delete to next nodes value
        node.val=node.next.val;
        //changing the next pointer to next nodes next
        node.next=node.next.next;
    }
}
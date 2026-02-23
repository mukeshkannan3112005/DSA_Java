//https://leetcode.com/problems/intersection-of-two-linked-lists/description/
//time complexity:O(m+n)
//space complexity:O(1)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //if either of the linked list is null then there is no intersection
        if(headA == null || headB == null) return null;
        ListNode temp1=headA;
        ListNode temp2=headB;
        //traverse both the linked list until they are equal
        while(temp1!=temp2)
        {
            //if temp1 reaches the end of the linked list then assign it to the head of the other linked list and vice versa for temp2
            temp1=temp1==null?headB:temp1.next;
            temp2=temp2==null?headA:temp2.next;
        }
        return temp1;
    }
}
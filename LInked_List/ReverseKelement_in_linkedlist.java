//https://leetcode.com/problems/reverse-nodes-in-k-group/description/
//time complexity:O(n)
//space complexity:O(1)
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;

        ListNode tail = head;
        //Move the tail pointer k steps ahead to find the end of the current group
        for (int i = 0; i < k; i++) {
            //If there are less than k nodes remaining, return the head as is (no reversal)
            if (tail == null) return head;
            tail = tail.next;
        }
        //Reverse the current group of k nodes and get the new head of this group
        ListNode newHead = reverse(head, tail);
        //Recursively reverse the remaining nodes starting from tail and connect it to the current group's new head
        head.next = reverseKGroup(tail, k);
        return newHead;
    }
    //helper function to reverse the linked list from cur to end
    private ListNode reverse(ListNode cur, ListNode end) {
        ListNode prev = null;
        while (cur != end) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
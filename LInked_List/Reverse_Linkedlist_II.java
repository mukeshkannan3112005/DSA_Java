//https://leetcode.com/problems/reverse-linked-list-ii/description/
//time complexity:O(n)
//space complexity:O(1)
class Reverse_Linkedlist_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        // Move prev to the node before the left position
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        // cur will point to the first node of the sublist to be reversed
        ListNode cur = prev.next;
        // Reverse the sublist between left and right
        for (int i = 0; i < right - left; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        return dummy.next;        
    }
}

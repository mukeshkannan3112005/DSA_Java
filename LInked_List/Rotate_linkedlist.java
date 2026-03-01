//https://leetcode.com/problems/rotate-list/description/
//time complexity: O(n)
//space complexity: O(1)

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Rotate_linkedlist {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: Find length and tail
        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Make circular
        tail.next = head;

        // Step 3: Find new tail
        k = k % length;
        int stepsToNewTail = length - k - 1;

        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 4: Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
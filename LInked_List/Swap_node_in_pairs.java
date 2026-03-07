//https://leetcode.com/problems/swap-nodes-in-pairs/description
//time complexity: O(n)
//space complexity: O(1)
class Swap_node_in_pairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        // Iterate through the list while there are at least two nodes to swap
        while (prev.next != null && prev.next.next != null) {
            ListNode one = prev.next;
            ListNode two = one.next;

            one.next = two.next;
            two.next = one;
            prev.next = two;

            prev = one;
        }

        return dummy.next;
    }
}
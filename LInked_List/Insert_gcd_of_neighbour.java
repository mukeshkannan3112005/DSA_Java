//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/
//time complexity: O(n) where n is the number of nodes in the linked list
//space complexity: O(1) we are not using any extra space we are just using a few variables to keep track of the nodes and the GCD value
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Insert_gcd_of_neighbour {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        // If the list contains only one node, return the head as no insertion is needed
        if (head.next == null) return head;

        // Initialize pointers to traverse the list
        ListNode node1 = head;
        ListNode node2 = head.next;

        // Traverse the linked list
        while (node2 != null) {
            int gcdValue = calculateGCD(node1.val, node2.val);
            ListNode gcdNode = new ListNode(gcdValue);

            // Insert the GCD node between node1 and node2
            node1.next = gcdNode;
            gcdNode.next = node2;

            // Move to the next pair of nodes
            node1 = node2;
            node2 = node2.next;
        }

        return head;
    }

    // Helper method to calculate the greatest common divisor using the Euclidean algorithm
    private int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
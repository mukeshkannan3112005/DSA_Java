//http:leetcode.com/problems/delete-node-in-a-linked-list/description/
//time complexity:O(1)
//space complexity:O(1)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Delete_node_without_knowning_head {
    public void deleteNode(ListNode node) {
        //change the value of the node to be delete to next nodes value
        node.val=node.next.val;
        //changing the next pointer to next nodes next
        node.next=node.next.next;
    }
}
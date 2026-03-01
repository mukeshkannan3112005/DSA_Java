//http://leetcode.com/problems/reverse-linked-list/description/
//time complexity: O(n) where n is the length of the list
//space complexity: O(1) we are not using any extra space we are just changing the pointers of the existing nodes
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode temp=null;
        ListNode result=null;
        //we will traverse the list and change the next pointer of each node to point to the previous node and move the pointer of head to next and repeat this process until head is null
        while(head!=null)
        {
            temp=head.next;
            head.next=result;
            result=head;
            head=temp;
        }
        return result;
    }
}
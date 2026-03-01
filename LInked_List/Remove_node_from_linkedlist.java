//https://leetcode.com/problems/remove-nodes-from-linked-list/description/
//time complexity:O(n)
//space complexity:O(1)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Remove_node_from_linkedlist {
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        int max=head.val;
        while(temp.next!=null)
        {
            if(temp.next.val<max)
            {
                //If the next node's value is less than the maximum value seen so far, skip it by adjusting the next pointer
                temp.next=temp.next.next;
            }
            else
            {
                //If the next node's value is greater than or equal to the maximum value, move the temp pointer forward and update the maximum value
                temp=temp.next;
                max=temp.val;
            }
        }
        head=reverse(head);
        return head;
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode dummy=null;
        ListNode rev=null;
        while(head!=null)
        {
            dummy=head.next;
            head.next=rev;
            rev=head;
            head=dummy;
        }
        return rev;
    }
}
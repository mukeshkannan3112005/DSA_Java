//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
//time complexity:O(n)
//space complexity:O(1)
public class Remove_the_nth_node_from_last {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head=reverse(head);
        ListNode temp=head;
        if(n==1)
        {
            head=head.next;
            return reverse(head);
        }
        for(int i=0;i<n-2;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
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

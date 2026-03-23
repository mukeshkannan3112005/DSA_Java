//https://leetcode.com/problems/partition-list/description/
//time complexity: O(n)
//space complexity: O(1)
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode lesser=new ListNode(0);
        ListNode greater=new ListNode(0);
        ListNode less=lesser;
        ListNode great=greater;
        // Step 1: Partition the list
        // Step 2: Combine the two lists
        // Step 3: Return the new head
        while(head!=null)
        {
            if(head.val>=x)
            {
                great.next=head;
                great=great.next;
            }
            else
            {
                less.next=head;
                less=less.next;
            }
            head=head.next;
        }
        less.next=greater.next;
        great.next=null;
        return lesser.next;
    }
   
}
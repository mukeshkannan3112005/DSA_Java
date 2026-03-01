//http:leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/
//time complexity:O(n)
//space complexity:O(1)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Max_twin_pair {
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        //traverse the linked list using two pointers, one pointer moves one step at a time and the other pointer moves two steps at a time. When the fast pointer reaches the end of the linked list, the slow pointer will be at the middle of the linked list
        while(fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rem=slow.next;
        slow.next=null;
        slow=head;
        ListNode rev=null;
        //reverse the second half of the linked list
        while(slow!=null)
        {
            fast=slow.next;
            slow.next=rev;
            rev=slow;
            slow=fast;
        }
        int max=-1;
        int sum=0;
        //traverse the linked list and find the maximum twin sum
        while(rev!=null)
        {
            sum=rev.val+rem.val;
            if(sum>max)
            {
                max=sum;
            }
            rev=rev.next;
            rem=rem.next;
        }
        return max;
    }
}

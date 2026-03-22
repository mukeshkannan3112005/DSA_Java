//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
// time complexity: O(n) because we are traversing the linked list once 
// space complexity: O(1) because we are not using any extra space we are just modifying the input linked list  
class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode prev=temp;
        ListNode cur=head;
        //We use two pointers, prev and cur, to traverse the linked list. The prev pointer is used to keep track of the last node that was not a duplicate, while the cur pointer is used to traverse the linked list and check for duplicates. We iterate through the linked list using a while loop until we reach the end (cur != null). Inside the loop, we check if the current node's value (cur.val) is equal to the next node's value (cur.next.val). If they are equal, it means we have found a duplicate. We then use another while loop to skip all nodes with the same value until we find a different value or reach the end of the list. After skipping the duplicates, we update the prev pointer's next reference to point to the node after the last duplicate (cur.next). If the current node's value is not equal to the next node's value, it means there are no duplicates at this position, and we simply move the prev pointer to the next node. Finally, we move the cur pointer to the next node in each iteration. After processing all nodes, we return temp.next as the head of the modified linked list without duplicates.   
        while(cur!=null && cur.next!=null)
        {
            if(cur.val==cur.next.val)
            {
                while(cur.next!=null && cur.val==cur.next.val)
                {
                    cur=cur.next;
                }
                prev.next=cur.next;
            }
            else
            {
                prev=prev.next;
            }
            cur=cur.next;
        }
        return temp.next;

    }
}
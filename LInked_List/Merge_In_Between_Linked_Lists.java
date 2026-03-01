//https://leetcode.com/problems/merge-in-between-linked-lists/description/
//time complexity:O(n)
//space complexity:O(1)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Merge_In_Between_Linked_Lists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode cut=null;
        //traverse the linked list until the end of the second linked list and keep track of the node at a-1 position
        for(int i=0;i<b;i++)
        {
            if(i==a-1)
            {
                cut=temp;
            }
            temp=temp.next;
        }
        //connect the node at a-1 position to the head of the second linked list and then connect the end of the second linked list to the node at b+1 position
        cut.next=list2;
        while(list2.next!=null)
        {
            list2=list2.next;
        }
        //connect the end of the second linked list to the node at b+1 position
        list2.next=temp.next;
        return list1;
    }
}
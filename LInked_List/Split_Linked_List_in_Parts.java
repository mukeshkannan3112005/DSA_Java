//https://leetcode.com/problems/split-linked-list-in-parts/description/
//time complexity:O(n)  where n is the number of nodes in the linked list
//space complexity:O(k) where k is the number of parts we need to split the linked list into
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
//Two-Pass Method:first we will find the length of the linked list and then we will split the linked list into k parts by traversing the linked list again and changing the next pointer of the last node of each part to null and storing the head of each part in the result array and return the result array
class Split_Linked_List_in_Parts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length=0;
        ListNode first=head;
        //finding the length of the linked list
        while(first!=null && first.next!=null)
        {
            length+=2;
            first=first.next.next;
        }
        if(first!=null)
        {
            length++;
        }
        int n=length/k;
        int rem=length%k;
        ListNode result[]=new ListNode[k];
        //we will traverse the linked list and split it into k parts and store the head of each part in the result array and move the pointer of head to next and repeat this process until head is null or we have split the linked list into k parts
        for(int i=0;head!=null && i<k;i++,rem--)
        {   
            result[i]=head;
            //we will move the pointer of head to next n nodes and if there is a remainder we will move it one more node and then we will break the linked list by changing the next pointer of the last node of the current part to null and repeat this process until head is null or we have split the linked list into k parts
            for(int j=0;j<n+(rem>0?1:0);j++)
            {
                first=head;
                head=head.next;
            }
            if(head!=null)
            {
                first.next=null;
            }
        }
        return result;
    }
}
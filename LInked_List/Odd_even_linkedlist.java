//https://leetcode.com/problems/odd-even-linked-list/description/
//time complexity: O(n) where n is the number of nodes in the linked list as we are traversing the linked list once to rearrange the nodes and then we are connecting the odd and even nodes together
//space complexity: O(1) as we are not using any extra space to rearrange the nodes we are just modifying the next pointers of the existing nodes in the linked list
public class Odd_even_linkedlist {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head, even = head.next, evenHead = even;
        // we are traversing the linked list and rearranging the nodes by connecting the odd nodes together and the even nodes together until we reach the end of the linked list and at the end we are connecting the odd nodes with the even nodes and returning the head of the modified linked list     
        while(even!=null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}

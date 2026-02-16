https://leetcode.com/problems/merge-two-sorted-lists/description/
//time complexity: O(n+m) where n and m are the length of the two lists
//space complexity: O(1) we are not using any extra space we are just changing the pointers of the existing nodes 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result=new ListNode();
        ListNode temp=result;
        //we will compare the value of list1 and list2 and add the smaller one to the result list and move the pointer of that list to next and repeat this process until one of the list is null
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                temp.next=list1;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        //after the loop one of the list is null and we need to add the remaining elements of the other list to the result list
        if(list1==null)
        {
            temp.next=list2;
        }
        else 
        {
            temp.next=list1;
        }
        return result.next;
        
    }
}
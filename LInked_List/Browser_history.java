//http:leetcode.com/problems/design-browser-history/description/
//time complexity:O(1)
//space complexity:O(n)
class BrowserHistory {
    //definition of the node of the linked list
    class ListNode {
        String val;
        ListNode next,prev;

        ListNode(String val) {
            this.val = val;
            this.next = null;
            this.prev=null;
        }
    }
    ListNode head;
    //constructor to initialize the head of the linked list
    public BrowserHistory(String homepage) {
        head=new ListNode(homepage);
    }
    //function to visit the url and add it to the linked list
    public void visit(String url) {
        ListNode newly_visited=new ListNode(url);
        head.next=newly_visited;
        newly_visited.prev=head;
        head=newly_visited;
    }
    //function to move back the given number of steps in the linked list
    public String back(int steps) {
        while(head.prev!=null && steps>0)
        {
            steps--;
            head=head.prev;
        }
        return head.val;
    }
    //function to move forward the given number of steps in the linked list
    public String forward(int steps) {
        while(head.next!=null && steps>0)
        {
            steps--;
            head=head.next;
        }
        return head.val;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
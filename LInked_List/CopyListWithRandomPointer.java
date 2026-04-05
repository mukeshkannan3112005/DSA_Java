package LInked_List;
//https://leetcode.com/problems/copy-list-with-random-pointer/description/
// timecomplexity: O(N) where N is the number of nodes in the linked list
// spacecomplexity: O(N) where N is the number of nodes in the linked list. This is because we are using a HashMap to store a mapping of original nodes to their corresponding copied nodes, which requires additional space proportional to the number of nodes in the linked list.    
// The CopyListWithRandomPointer class contains a method copyRandomList that takes the head of a linked list as input and returns a deep copy of the linked list. The method first creates a HashMap to store a mapping of original nodes to their corresponding copied nodes. It then iterates through the original linked list, creating a new node for each original node and storing the mapping in the HashMap. After creating the copied nodes, it iterates through the original linked list again to set the next and random pointers for each copied node using the mappings stored in the HashMap. Finally, it returns the head of the copied linked list, which is obtained from the HashMap using the original head as the key.
// approach: We use a HashMap to store a mapping of original nodes to their corresponding copied        
// nodes. We first iterate through the original linked list to create a new node for each original node and store the mapping in the HashMap. Then, we iterate through the original linked list again to set the next and random pointers for each copied node using the mappings stored in the HashMap. This approach allows us to efficiently create a deep copy of the linked list while maintaining the correct relationships between the nodes, including both the next and random pointers.
// technique: HashMap
import java.util.HashMap;
import java.util.Map;
class CopyListWithRandomPointer {
        class Node {
            int val;
            Node next;
            Node random;
    
            public Node(int val) {
                this.val = val;
                this.next = null;
                this.random = null;
            }
        }
    public Node copyRandomList(Node head) {
        Map<Node, Node> hashMap = new HashMap<>();
        Node cur = head;
        // We iterate through the original linked list, creating a new node for each original node and storing the mapping in the HashMap. This allows us to easily access the corresponding copied node for any original node when we need to set the next and random pointers in the second iteration. The HashMap uses the original nodes as keys and their corresponding copied nodes as values, which helps us maintain the relationships between the nodes in the copied linked list. 
        while (cur != null) {
            hashMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        // After creating the copied nodes, we iterate through the original linked list again to set the next and random pointers for each copied node using the mappings stored in the HashMap. This ensures that the copied linked list maintains the same structure and relationships as the original linked list, including both the next and random pointers. We use the HashMap to easily access the corresponding copied nodes for the next and random pointers of each original node, allowing us to efficiently set these pointers in the copied linked list.  
        while (cur != null) {
            Node copy = hashMap.get(cur);
            copy.next = hashMap.get(cur.next);
            copy.random = hashMap.get(cur.random);
            cur = cur.next;
        }

        return hashMap.get(head);        
    }
}
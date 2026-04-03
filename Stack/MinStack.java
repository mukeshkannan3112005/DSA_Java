//https://leetcode.com/problems/min-stack/description/
//timecomplexity: O(1) for all operations as we are using a list to store the values and their corresponding minimums
//spacecomplexity: O(n) as we are storing all the values and their corresponding minimums in the list   
// The MinStack class uses a list to store pairs of integers, where each pair consists of the value pushed onto the stack and the minimum value at that point in the stack. This allows for constant time retrieval of the minimum value while maintaining the stack properties.
//aproach: We maintain a list of pairs, where each pair contains the value pushed onto the stack and the minimum value at that point. When we push a new value, we compare it with the current minimum and store the new minimum if necessary. This way, we can retrieve the minimum value in constant time when needed.    
//technique: Stack, List
import java.util.ArrayList;
import java.util.List;
class MinStack {
    private List<int[]> st;
    public MinStack() {
        st=new ArrayList<>();
    }
    // The push method adds a new value to the stack along with the minimum value at that point. If the stack is empty, it initializes the minimum with the value being pushed. Otherwise, it compares the new value with the current minimum and updates the minimum if necessary before adding the new pair to the stack. 
    public void push(int val) {
        if(st.isEmpty())
        {
            st.add(new int[]{val,val});
        }
        else
        {
            int[] top=st.get(st.size()-1);
            int min=top[1];
            if(min>val)
            {
                min=val;
            }
            st.add(new int[]{val,min});
        }
    }
    // The pop method removes the top element from the stack by removing the last pair from the list. This effectively pops the value and its corresponding minimum from the stack. 
    public void pop() {
        st.remove(st.size()-1);
    }
    // The top method retrieves the value of the top element in the stack by accessing the last pair in the list and returning the first element of that pair, which represents the value. If the stack is empty, it returns -1.    
    public int top() {
        if(st.isEmpty())
        {
            return -1;
        }
        return st.get(st.size()-1)[0];
    }
    // The getMin method retrieves the minimum value in the stack by accessing the last pair in the list and returning the second element of that pair, which represents the minimum value at that point in the stack. If the stack is empty, it returns -1.    
    public int getMin() {
        if(st.isEmpty())
        {
            return -1;
        }
        return st.get(st.size()-1)[1];
    }
}

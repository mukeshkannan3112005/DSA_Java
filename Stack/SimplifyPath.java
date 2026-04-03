//https://leetcode.com/problems/simplify-path/description/
//Time Complexity: O(n) because we are traversing the input string once and performing stack    
//operations that take O(1) time on average
//Space Complexity: O(n) because in the worst case, we may need to store all the components of the path in the stack if they are all valid directory names
//The algorithm works by splitting the input path into components using the "/" delimiter, and then using a stack to keep track of the valid directory names. We ignore empty components and "." which represent the current directory, and we pop from the stack when we encounter ".." which represents moving up one directory. Finally, we construct the simplified path by joining the components in the stack with "/" and return it.
//approach/techinique used: Stack, String Manipulation 
import java.util.Stack;
class SimplifyPath {
    public String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> st = new Stack<>();
        // Iterate through the components of the path and process each one according to the rules for simplification    
        for (String comp : components) {
            if (comp.equals("") || comp.equals(".")) {
                continue;
            }

            if (comp.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(comp);
            }
        }

        // Construct the simplified path by joining the components in the stack with "/" and return it. If the stack is empty, return "/"   
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }
        // If the StringBuilder is empty, it means we are at the root directory, so we return "/". Otherwise, we return the constructed path as a string.   
        return sb.length() == 0 ? "/" : sb.toString();        
    }
}
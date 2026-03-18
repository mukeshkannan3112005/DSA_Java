
import java.util.ArrayList;
import java.util.List;

public class Build_an_Array_With_Stack_Operations {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        
        int index = 0; // pointer for target array
        
        for (int num = 1; num <= n && index < target.length; num++) {
            
            // Always push the number
            operations.add("Push");
            
            // If this number matches target, keep it
            if (num == target[index]) {
                index++;
            } 
            // Otherwise, pop it
            else {
                operations.add("Pop");
            }
        }
        
        return operations;
    }
}

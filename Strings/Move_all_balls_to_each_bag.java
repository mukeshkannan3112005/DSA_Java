//https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/ 
//time complexity: O(n) where n is the length of the input string as we are traversing the input string three times to calculate the suffix and prefix arrays and then to calculate the result array
//space complexity: O(n) as we are using three extra arrays of size n to store the suffix, prefix and result values     
package Strings;
public class Move_all_balls_to_each_bag {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int result[]=new int[n];
        int suffix[]=new int[n];
        int prefix[]=new int[n];
        int count=(boxes.charAt(0)=='1'?1:0);
        // we are traversing the input string and calculating the suffix array which stores the number of operations required to move all the balls to the right of the current index and then we are traversing the input string in reverse and calculating the prefix array which stores the number of operations required to move all the balls to the left of the current index and at the end we are traversing both the suffix and prefix arrays and calculating the result array which stores the total number of operations required to move all the balls to each box and returning the result array   
        for(int i=1;i<n;i++)
        {
            suffix[i]=suffix[i-1]+count;
            count+=(boxes.charAt(i)=='1'?1:0);
        }
        count=(boxes.charAt(n-1)=='1'?1:0);
        // we are traversing the input string in reverse and calculating the prefix array which stores the number of operations required to move all the balls to the left of the current index and at the end we are traversing both the suffix and prefix arrays and calculating the result array which stores the total number of operations required to move all the balls to each box and returning the result array       
        for(int i=n-2;i>=0;i--)
        {
            prefix[i]=prefix[i+1]+count;
            count+=(boxes.charAt(i)=='1'?1:0);
        }
        for(int i=0;i<n;i++)
        {
            result[i]=suffix[i]+prefix[i];
        }
        return result;
    }
}

//https://leetcode.com/problems/insert-interval/description
//time complexity: O(n) where n is the length of the input array
//space complexity: O(n) where n is the length of the input array
//approach: we can use a two pointer approach to traverse the intervals and merge the overlapping intervals. We can use a list to store the merged intervals and add it to the result list when we reach the end of the intervals. We can use a for loop to iterate through the intervals and check if the current interval overlaps with the new interval. If it does, we merge the two intervals and update the new interval. If it doesn't, we add the current interval to the result list. Finally, we return the result list as an array.
//technologies used: Java, Two Pointer, List
import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        int n=intervals.length;
        List<int[]>res=new ArrayList<>();

        //traversing the intervals with is less than the value if newInterval[0]
        while(i<n && intervals[i][1]<newInterval[0])
        {
            res.add(intervals[i]);
            i++;
        }

        //merging the intervals 
        while(i<n && intervals[i][0]<=newInterval[1])
        {
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        
        res.add(newInterval);
        //adding the remaining intervals
        while(i<n)
        {
            res.add(intervals[i]);
            i++;
        }

        //converting the ArrayList to int[] format
        return res.toArray(new int[res.size()][]);
    }
}

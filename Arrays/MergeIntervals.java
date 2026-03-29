//https://leetcode.com/problems/merge-intervals/description/
//timecomplexity: O(n log n) due to sorting
//spacecomplexity: O(n) for the merged list
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        //sort the array based on first element 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //list to store the merged intervals
        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        //interating from the second interval to the last interval
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            //check the previous interval's end time with the current interval's start time
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }
        
        merged.add(prev);
        //convert the list of array into 2D array as required.
        return merged.toArray(new int[merged.size()][]);         
    }
}
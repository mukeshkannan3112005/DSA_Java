//https://leetcode.com/problems/gas-station/description/
//time complexity: O(n)
//space complexity: O(1)
class Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int n=gas.length;
        int total_cost=0;
        int current_cost=0;
        //Iterate through each gas station, calculating the net cost (gas[i] - cost[i]) at each station and keeping track of the total net cost and the current net cost. If the current net cost drops below zero, it means we cannot start from the previous starting point, so we reset the current net cost and update the starting point to the next station. After iterating through all stations, if the total net cost is negative, it means it's impossible to complete the circuit, so we return -1; otherwise, we return the starting index. 
        for(int i=0;i<n;i++)
        {
            total_cost+=gas[i]-cost[i];
            current_cost+=gas[i]-cost[i];
            if(current_cost<0)
            {
                current_cost=0;
                start=i+1;
            }
        }
        return total_cost<0?-1:start;
    }
}
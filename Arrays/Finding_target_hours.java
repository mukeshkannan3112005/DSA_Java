//https://leetcode.com/problems/number-of-employees-who-met-the-target/description/
// time complexity:O(n)
// space complexity:O(1)
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result=0;
        //finding the employees worked at least target hours.
        for(int i=0;i<hours.length;i++)
        {
            if(hours[i]>=target)
            {
                result++;
            }
        }
        return result;
        
    }
}
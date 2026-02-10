//https://leetcode.com/problems/richest-customer-wealth/description/
class Solution {
    public int maximumWealth(int[][] accounts) {
          int max=0;
          for(int[] i:accounts)//for each to get the accounts
          {
            int sum=0;
            for(int money:i)//for each to get the wealth of each customer
            {
                sum+=money;//find the total money
            }
            max=sum>max?sum:max;//finding the max wealth
          }  
          return max;
    }
}
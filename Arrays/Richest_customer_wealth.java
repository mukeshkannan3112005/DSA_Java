//https://leetcode.com/problems/richest-customer-wealth/description/
// time complexity:O(n*m) because we are traversing the 2D array once
// space complexity:O(1) because we are not using any extra space we are just using two variables to keep track of the sum and the max wealth
class Richest_customer_wealth {
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
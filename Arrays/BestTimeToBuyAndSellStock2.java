//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
//time complexity:O(n) because we are traversing the array once to find the profit
//space complexity:O(1) because we are not using any extra space to store the elements of the array 
class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        // we are traversing the array and comparing the current element with the previous element and if the current element is greater than the previous element then we are adding the difference to the profit because we can buy and sell the stock multiple times 
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        
        return profit;        
    }
}
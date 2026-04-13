//https://leetcode.com/problems/coin-change/description/
// timecomplexity: O(n * m) where n is the amount and m is the number of coins.
//spacecomplexity: O(n) for the minCoins array
//Approach: We can use dynamic programming to solve this problem. We create an array minCoins where minCoins[i] represents the minimum number of coins needed to make up the amount i. We initialize the array with a value greater than the maximum possible coins (amount + 1) and set minCoins[0] to 0 since no coins are needed to make up the amount 0. We then iterate through each amount from 1 to the given amount and for each coin, we check if it can be used to make up the current amount (i.e., if i - coins[j] >= 0). If it can, we update minCoins[i] to be the minimum of its current value and 1 plus the number of coins needed for the remaining amount (minCoins[i - coins[j]]). Finally, we return minCoins[amount] if it is not equal to amount + 1, otherwise we return -1 indicating that it is not possible to make up the amount with the given coins.
//technique: Dynamic Programming    
import java.util.Arrays;
class CoinChange{
    public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;
        // Iterate through each amount from 1 to the given amount and for each coin, check if it can be used to make up the current amount. If it can, update minCoins[i] to be the minimum of its current value and 1 plus the number of coins needed for the remaining amount.    
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coins[j]]);
                }
            }
        }

        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;        
    }
}
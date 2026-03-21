//https://leetcode.com/problems/candy/description/
//time complexity: O(n)
//space complexity: O(n)
class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int cnt = 0;
        int[] candies = new int[n];
        //Initialize an array to store the number of candies for each child, starting with 1 candy for each child. Then, iterate through the ratings from left to right, and if a child has a higher rating than the previous child, give them one more candy than the previous child. Next, iterate through the ratings from right to left, and if a child has a higher rating than the next child, ensure they have at least one more candy than the next child by taking the maximum of their current candy count and one more than the next child's candy count. Finally, sum up all the candies to get the total number of candies needed. 
        for(int i=0;i<n;i++)
            candies[i]=1;
        for (int i = 1; i < n; i++)
            if (ratings[i] > ratings[i - 1])
                candies[i] = candies[i - 1] + 1;
        for (int i = n - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i])
                candies[i - 1] = Math.max(candies[i] + 1, candies[i - 1]);
            cnt += candies[i - 1];
        }
        return cnt + candies[n - 1];
    }
}
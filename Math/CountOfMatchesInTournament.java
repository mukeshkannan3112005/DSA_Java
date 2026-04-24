package Math;
//https://leetcode.com/problems/count-of-matches-in-tournament/description/ 
// time complexity: O(log n) where n is the number of teams because we are halving the number of teams in each round.   
// space complexity: O(1) because we are using constant space to store the total number of matches and the number of teams in each round.   
// approach: we can simply iterate through the number of teams and calculate the number of matches in each round. If the number of teams is even, then the number of matches in that round will be n/2 and the number of teams in the next round will also be n/2. If the number of teams is odd, then the number of matches in that round will be (n-1)/2 and the number of teams in the next round will be ((n-1)/2)+1. We will keep iterating until there is only one team left and we will return the total number of matches.  
// technique used: math
class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        int totalMatches=0;
        while(n>1)
        {
            totalMatches+=n%2==0?n/2:(n-1)/2;
            n=n%2==0?n/2:((n-1)/2)+1;
        }
        return totalMatches;
    }
}
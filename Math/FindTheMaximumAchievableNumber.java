package Math;
//https://leetcode.com/problems/find-the-maximum-achievable-number/description/
// time complexity: O(1)
// space complexity: O(1)
// approach: we can simply return the sum of the number and the product of 2 and t because we can add 2 to the number t times to get the maximum achievable number. 
// technique used: math
class FindTheMaximumAchievableNumber {
    public int theMaximumAchievableX(int num, int t) {
        return num+(2*t);
    }
}
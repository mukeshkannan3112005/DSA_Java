//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max=0;
        for(int element:candies)//finding maximum element in the array
        {
            if(element>max)
            {
                max=element;
            }
        }
        for(int element:candies)//checking the sum of candies[i]+extraCandies>=max
        {
            if(element+extraCandies>=max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }

        return result;
    }
}
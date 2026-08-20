import java.util.ArrayList;
//https://leetcode.com/problems/distribute-elements-into-two-arrays-i/description
//time complexity: O(n) where n is the length of the input array
//space complexity: O(n) where n is the length of the input array
//approach: we can use two array lists to store the even and odd elements of the    input array. We can use a for loop to iterate through the input array and check if the current element is greater than the last element of the odd array list. If it is, we add it to the odd array list. If it isn't, we add it to the even array list. Finally, we can combine the two array lists into a single result array and return it.  
//technologies used: Java, ArrayList
public class DistributeElementsIntoTwoArraysI {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        if(n==0 || n==1 || n==2) return nums;
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        even.add(nums[0]);
        odd.add(nums[1]);
        for(int i=2;i<n;i++)
        {
            if(odd.get(odd.size()-1)>even.get(even.size()-1))
            {
                odd.add(nums[i]);
            }
            else
            {
                even.add(nums[i]);
            }
        }
        int s=even.size();
        for(int i=0;i<s;i++)
        {
            res[i]=even.get(i);
        }
        for(int i=0;i<odd.size();i++)
        {
            res[i+s]=odd.get(i);
        }
        return res;
    }
}
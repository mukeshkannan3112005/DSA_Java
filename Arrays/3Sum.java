//https://leetcode.com/problems/3sum/description/
//timecomplexity: O(n^2) as we are using two nested loops to iterate
//spacecomplexity: O(n) as we are storing the result in a list of lists which can grow up to O(n) in the worst case
// The 3Sum class contains a method threeSum that takes an array of integers as input and returns a list of lists of integers, where each inner list contains three integers that sum up to zero. The method first sorts the input array and then uses a two-pointer technique to find all unique triplets that sum to zero. It also includes checks to skip duplicate values to ensure that the result contains only unique triplets.      
//approach: We sort the input array and then use a two-pointer technique to find all unique triplets that sum to zero. We iterate through the sorted array, and for each element, we set two pointers: one starting just after the current element and another starting at the end of the array. We then check the sum of the three elements (current element + element at left pointer + element at right pointer). If the sum is less than zero, we move the left pointer to the right to increase the sum. If the sum is greater than zero, we move the right pointer to the left to decrease the sum. If the sum is exactly zero, we add the triplet to our result list and move both pointers while skipping over duplicate values to ensure uniqueness.    
//technique: Two-pointer technique, Sorting
class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        // We sort the input array to facilitate the two-pointer technique and to easily skip duplicate values. Sorting allows us to efficiently find triplets that sum to zero by moving the pointers based on the current sum.    
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            // We check if the current element is the same as the previous element to skip duplicate values. This ensures that we do not include the same triplet multiple times in our result list. If the current element is a duplicate of the previous one, we continue to the next iteration of the loop without processing it.    
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }

            int j=i+1;
            int k=nums.length-1;
            // We use a while loop to move the two pointers (j and k) towards each other until they meet. Inside the loop, we calculate the total sum of the current element (nums[i]) and the elements at the left (nums[j]) and right (nums[k]) pointers. Based on the value of the total, we adjust the pointers accordingly: if the total is less than zero, we move the left pointer to the right to increase the sum; if the total is greater than zero, we move the right pointer to the left to decrease the sum; if the total is exactly zero, we add the triplet to our result list and move both pointers while skipping over duplicate values to ensure uniqueness. 
            while(j<k)
            {
                int total=nums[i]+nums[j]+nums[k];
                if(total<0) j++;
                else if(total>0) k--;
                else
                {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;

                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
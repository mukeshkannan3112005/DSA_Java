//https://leetcode.com/problems/plus-one/description/
// time complexity:O(n) because we are traversing the array once
// space complexity:O(1) because we are not using any extra space we are just modifying the input array
class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        for(i=digits.length-1;i>=0;i--)
        {
            //while traversing the array from last if the digit is 9 change it 0 and increment the next digit 
            if(digits[i]==9)
            {
                digits[i]=0;
            }
            else{
                digits[i]++;
                break;
            }
        }
        //consider if the array contains [9,9] while increment we get [1,0,0] so create a array with size digit+1 and increment the 0th index value
        if(i==-1)
        {
            int[] result=new int[digits.length+1];
            result[0]=digits[0]+1;
            for(i=1;i<=digits.length;i++)
            {
                result[i]=0;
            }
            return result;
        }
        return digits;
    }
}
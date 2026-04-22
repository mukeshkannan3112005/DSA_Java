package Math;
//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/
// time complexity: O(n*m) where n is the number of rows in the bank and m is the number of columns in the bank
// space complexity: O(1)
// approach: we can simply iterate through the bank and count the number of security devices in each row. If the number of security devices in a row is zero then we can skip that row. If the number of security devices in a row is greater than zero then we can calculate the number of laser beams that can be formed with the previous row which has security devices. The number of laser beams that can be formed with the previous row is the product of the number of security devices in the current row and the number of security devices in the previous row. We can keep track of the number of security devices in the previous row and update it for each row. Finally, we will get the total number of laser beams that can be formed in the bank.
// technique used: math
class  NumberOfLaserBeamsInABank{
    public int numberOfBeams(String[] bank) {
        int result=0,prev=0;
        for(int i=0;i<bank.length;i++)
        {
            int count=count(bank[i]);
            // if the number of security devices in the current row is zero then we can skip that row   
            if(count==0) continue;
            result+=prev*count;
            prev=count;
        }
        return result;
    }
    // helper function to count the number of security devices in a row
    public int count(String bank)
    {
        int count=0;
        for(char ch:bank.toCharArray())
        {
            if(ch=='1') count++;
        }
        return count;
    }
}
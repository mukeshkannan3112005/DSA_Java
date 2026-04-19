package Strings;
//https://leetcode.com/problems/convert-date-to-binary/description/
// time complexity: O(n)
// space complexity: O(n)
// approach: we can split the date string by "-" and then convert each part to binary using a helper function. The helper function will take a string as input and convert it to an integer and then convert that integer to binary using a while loop. We will keep on adding the last digit of the number to the binary string and then remove the last digit from the original number until the number becomes less than 2. Finally, we will reverse the binary string and return it. We will concatenate the binary strings of each part of the date with "-" in between and return the final result.
// technique used: string manipulation, math
class ConvertDateToBinary{
    // helper function to convert a string to binary
    private static String StringToBinary(String str)
    {
        int num=Integer.parseInt(str);
        StringBuilder binary=new StringBuilder();
        while(num>=2)
        {
            binary.append(num%2);
            num=num/2;
        }
        binary.append(num);
        return binary.reverse().toString();
    }
    public String convertDateToBinary(String date) {
        String str[]=date.split("-");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length;i++)
        {
            result.append(StringToBinary(str[i]));
            // add "-" between the binary strings of each part of the date
            if(str.length-1!=i)
            {
                result.append("-");
            }
        }
        return result.toString();
    }
}
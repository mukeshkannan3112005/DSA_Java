//https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/
class Solution {
    public int[] findArray(int[] pref) {
        for(int i=pref.length-1;i>0;i--)
        {
            pref[i]^=pref[i-1]; //find the xor form reverse of the array and storing in i th position.
        }
        return pref;
    }
}
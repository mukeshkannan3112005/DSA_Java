//https://leetcode.com/problems/mirror-distance-of-an-integer/description/
// time complexity: O(log n)
// space complexity: O(1)
// approach: we can reverse the number and then find the absolute difference between the original number and
// the reversed number. To reverse the number, we can use a while loop and keep on adding the last digit of the number to the reversed number and then remove the last digit from the original number.
// technique used: math 
class MirrorDistanceOfAnInteger {
    public int mirrorDistance(int n) {
        int num=n,rev=0;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        return Math.abs(n-rev);
    }
}
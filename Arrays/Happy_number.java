//https://leetcode.com/problems/happy-number/description/
class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> cycle=new HashSet<>(); //created a set to trace the value if there is any cycle
        while(n!=1)
        {
            if(cycle.contains(n))
            {
                return false;  //if the element already in the set there form a cycle so the loop run infinitly so we stop here and return false
            }
            cycle.add(n);
            int sum=0;
            while(n>0) //find the sum of square of digits
            {
                int rem=n%10;
                sum+=rem*rem;
                n=n/10;
            }
            n=sum;
        }
        return true; //if n==1 we came out of loop and return true  
    }
}
package Math;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
// time complexity: O(log n) because we are dividing the number by 2 in each step, which takes O(log n) time.
// space complexity: O(1) because we are using constant space to store the count of steps.  
// approach: we can use a while loop to keep reducing the number until it becomes zero. In each iteration, we can check if the number is even or odd. If it is even, we can divide it by 2. If it is odd, we can subtract 1 from it. We can also increment the count of steps in each iteration. Finally, we can return the count of steps.
// technique used: math, iteration
class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int result=0;
        while(num>0)
        {
            result++;
            num=num%2==0?num/2:num-1;
        }
        return result;
    }
}
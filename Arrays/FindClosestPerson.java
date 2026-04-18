// https://leetcode.com/problems/find-closest-person-to-given-two-persons/description/
// time complexity: O(1)
// space complexity: O(1)
// approach: we can use the absolute value to find the distance between x and z and y
// and z. If the distance between x and z is equal to the distance between y and z, then we can return 0. If the distance between x and z is less than the distance between y and z, then we can return 1. Otherwise, we can return 2.
// technique used: math
class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        return Math.abs(x-z)==Math.abs(y-z)?0:Math.abs(x-z)<Math.abs(y-z)?1:2;
    }
}
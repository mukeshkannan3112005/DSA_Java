//finding the order of my friends from the finish order
//https://leetcode.com/problems/restore-the-finishing-order/description/
// time complexity:O(n^2) because we are using two nested loops to find the finishing order of my friends
// space complexity:O(n) because we are using an extra array to store the finishing order of my friends
class Restore_finishing_order {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] finishingOrder = new int[friends.length];
        int k = 0;
        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(order[i] == friends[j]){  // checking which friend occurs in order
                    finishingOrder[k++] = order[i];
                    break;
                }
            }            
        }

        return finishingOrder;
    }
}
//finding the order of my friends from the finish order
class Solution {
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
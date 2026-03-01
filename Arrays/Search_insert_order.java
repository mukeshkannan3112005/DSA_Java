//https://leetcode.com/problems/search-insert-position/description/
// time complexity:O(log n) because we are using binary search to find the position of the key in the array
// space complexity:O(1) because we are not using any extra space we are just using two variables to keep track of the left and right pointers
class Search_insert_order {
    public int searchInsert(int[] arr, int key) {
        int low = 0;     //left element
        int high = arr.length - 1; //right element

        while (low <= high) {   
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;   // key found
            } 
            else if (arr[mid] < key) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return high+1;   //if key not found return the were the element is inserted in order
        
    }
}
/* 
//recursive solution
class Search_insert_order_recursive {
    public int searchInsert(int[] arr, int key) {
       return binarySearch(arr,0,arr.length-1,key);
        
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {

        if (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                return binarySearch(arr, mid + 1, high, key);
            else
                return binarySearch(arr, low, mid - 1, key);
        }

        return high+1;
    }
}
*/
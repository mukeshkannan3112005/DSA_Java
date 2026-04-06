//https://leetcode.com/problems/set-matrix-zeroes/description/
//time complexity: O(n*m) as we are traversing the matrix multiple times
//space complexity: O(1) as we are using constant space for variables
// The algorithm first checks if the first row and first column contain any zeros and stores that information in two boolean variables. Then, it iterates through the rest of the matrix and marks the corresponding first row and first column elements as zero if a zero is found. After that, it iterates through the matrix again and sets the elements to zero based on the markings in the first row and first column. Finally, it checks the boolean variables to determine if the first row and first column should be set to zero.     
// technique used: In-place modification of the matrix to store the state of rows and columns that need to be zeroed, while using boolean variables to track the state of the first row and first column.   
class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;
        // Check if the first row contains any zeros
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        // Check if the first column contains any zeros
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        // Mark the first row and first column based on the presence of zeros in the rest of the matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set the elements to zero based on the markings in the first row and first column
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // Set the first row to zero if needed
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        // Set the first column to zero if needed
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
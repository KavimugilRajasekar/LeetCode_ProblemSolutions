class Solution {
    private int findColumn(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][0] == target) {
                return mid;  // Return the row index
            } else if (matrix[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;  // Returns the row where target would be inserted , if Greate then n-1 , if Lesser then -1 will be return in here !! 
    }

    private boolean findRow(int[] row, int target) {
        int left = 0;
        int right = row.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int row = findColumn(matrix, target);
        
        // If row is -1, target is smaller than all first elements
        if (row < 0) {
            return false;
        }
        
        return findRow(matrix[row], target);
    }
}
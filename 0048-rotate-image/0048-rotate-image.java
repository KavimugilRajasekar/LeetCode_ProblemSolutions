class Solution {
    public void rotate(int[][] matrix) {
        if( matrix.length == 0 ){
            // If Matrix is Null ..
            return ;
        }else if( matrix.length == 1 ){
            // just one element in Matrix Also get Nothing ..
            return ;
        }else{
            int n = matrix.length;

            //First Transverse the Matrix !!!! Then !!
            for(int i = 0 ; i < n - 1 ; i++){
                for(int j = 1 + i; j < n ; j++){
                    swap(matrix , i , j , j , i);
                }
            }

            //Then Now Swap the Row's Which Get the 90 degree Matrix !!
            for(int i = 0 ; i < n ; i++){
                int left = 0;
                int right = n - 1; 
                while(left < right ){
                    swap(matrix, i , left , i , right);
                    left++;
                    right--;
                }
            }
        }
    }

    private void swap(int[][] matrix,int x1,int y1,int x2 ,int y2){
        int temp =  matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;

    }
}
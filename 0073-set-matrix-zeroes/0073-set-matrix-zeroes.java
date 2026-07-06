class Solution {
    public void setZeroes(int[][] matrix) {

        // If Empty Matrix is Given 
        if( matrix.length == 0 || matrix[0].length == 0 ){
            return ;
        }
        
        // if Single Row Matrix 
        if(matrix.length == 1){
            boolean isContainZero = false;
            for(int i = 0 ; i < matrix[0].length ; i++){
                if(matrix[0][i] == 0){
                    isContainZero = true ;
                    break ;
                }
            }
            if(isContainZero){
                for(int i = 0 ; i < matrix[0].length ; i++){
                    matrix[0][i] = 0;
                }
                    
            }

            return;
        }

        // if Single Col Matrix 
        if(matrix[0].length == 1){
            boolean isContainZero = false;
            for(int i = 0 ; i < matrix.length ; i++){
                if(matrix[i][0] == 0){
                    isContainZero = true ;
                    break ;
                }
            }
            if(isContainZero){
                for(int i = 0 ; i < matrix.length ; i++){
                    matrix[i][0] = 0;
                }
                    
            }

            return;
        }

        //Get Row and Column Values , matrix[0].length() --> At First Row How many Columns present ..
        int row = matrix.length;
        int col = matrix[0].length;

        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        for(int i = 0 ; i < col ; i++){
            // To Check First Row , I Check Col Elements !
            if(matrix[0][i] == 0 ){
                isFirstRowZero = true;
                break;
            }
        }

        
        for(int i = 0 ; i < row ; i++){
            if(matrix[i][0] == 0 ){
                isFirstColZero = true;
                break;
            }
        }

        // Marker , Use the Matrix First Row and Column as Memory..
        for(int i = 1 ; i < row ; i++){
            for(int j = 1 ; j < col ; j++){
                if( matrix[i][j] == 0 ){

                    matrix[0][j] = 0; // Row Memory
                    matrix[i][0] = 0; // Col Memory 
                }
            }
        }

        for(int i = 1 ; i < row ; i++){
            for(int j = 1 ; j < col ; j++){
                if( matrix[i][0] == 0 // Col Memory
                || 
                matrix[0][j] == 0 ){  // Row Memory
                   matrix[i][j] = 0 ;
                }
            }
        }


        // Final Update , We Use the First Row & Col memory so if already they are have Zero We have to Zero them .. 
        if(isFirstRowZero){
                for(int i = 0 ; i < col ; i ++){
                    matrix[0][i] = 0 ;
                }
        }
        
        if(isFirstColZero){
                for(int i = 0 ; i < row ; i ++){
                    matrix[i][0] = 0 ;
                }
        }

    }
}
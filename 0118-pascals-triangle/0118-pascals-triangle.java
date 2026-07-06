class Solution {
    public List<List<Integer>> generate(int numRows) {

        // Initialize the Triangle of Pyramid !

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0 ; i < numRows ; i++){
            
            //Current Row
            List<Integer> currentRow = new ArrayList<>();
            for( int j = 0 ; j <= i ; j++ ){
                if(i == j || j == 0 ){
                    currentRow.add(1);
                }
                else{
                    //Get Previous Array List From Triangle to Process the Current Row !
                    List<Integer> previousRow = triangle.get(i-1); 
                    int value = previousRow.get(j-1) + previousRow.get(j) ;
                    currentRow.add(value);
                }              
            }
            triangle.add(currentRow);
        }

        return triangle ;
         
    }
}
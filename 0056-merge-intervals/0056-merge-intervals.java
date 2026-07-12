class Solution {
    public int[][] merge(int[][] intervals) {
        
        if( intervals.length == 1){
            return intervals ;
        }
        // Get How Many Number of Intervals Given !!
        int n = intervals.length ; 


        //Sort a 2D Array .. then it could be Easier for us .. 
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0],b[0]));

        // Let's Create a New Array-List then Create a Solution by Merging them !!
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
         for(int i = 1 ; i < intervals.length ; i++){
            int[] last = result.get(result.size() - 1 );

            if(intervals[i][0] <= last[1]){
                last[1] = Math.max(last[1], intervals[i][1]);
            }else{
                result.add(intervals[i]);
            }
         }

        return result.toArray(new int[result.size()][]); 
    }
}
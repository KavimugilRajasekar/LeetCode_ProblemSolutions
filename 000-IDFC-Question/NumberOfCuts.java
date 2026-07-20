class Solution{
	
	public int numberOfCounts(int n , int m){
		// N -> Number of Rolls .
		// M -> Sponsers
		int nCuts = 0;
		int pieces = n;
		int i = 1;
		while(!(pieces >= m)){
			nCuts = n * i;
			pieces = nCuts + n ;
			i++; 			
		}

		return nCuts;
	
	}

}

public class NumberOfCuts {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // Hardcoded Input
        int n = 2; // Number of Rolls
        int m = 6; // Required Sponsers

        int result = sol.numberOfCounts(n, m);

        System.out.println("Number of Rolls : " + n);
        System.out.println("Required Pieces : " + m);
        System.out.println("Minimum Cuts    : " + result);
    }
}
class Solution {
    public int mostFrequentEven(int[] nums) {
        int result = -1;
        int maxFreq = 0;
        Arrays.sort(nums);

        Map<Integer,Integer> freq = new HashMap<>();

       for (int num : nums) {
            // If key exists, increment; else insert with value 1
            if((num & 1) != 1){
                freq.merge(num, 1, Integer::sum);
                }
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            // Update if higher frequency OR same frequency but smaller number
            if (count > maxFreq || (count == maxFreq && num < result)) {
                maxFreq = count;
                result = num;
            }
        }

        return result;
    }
}
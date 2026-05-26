class Solution {
    public int findMaxLength(int[] nums) {
        int result = 0;
        int prefixSum = 0;
        Map<Integer,Integer> prefixSumMap =  new HashMap<>();

        prefixSumMap.put(0,-1);

        for(int i = 0;i<nums.length;i++) {
            prefixSum = prefixSum + (nums[i] == 0 ? -1 : 1);


            if (prefixSumMap.containsKey(prefixSum)) {
                Integer previousIndex = prefixSumMap.get(prefixSum);
                result = Math.max(result, i-previousIndex);
            } else {
                prefixSumMap.put(prefixSum, i);
            }
        }
        return result;

    }
}
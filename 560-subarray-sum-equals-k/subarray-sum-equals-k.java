class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int res = 0;
        Map<Integer, Integer> valueMap = new HashMap<>();

        valueMap.put(0, 1);

        for(int i = 0 ; i< nums.length;++i) {
            prefixSum += nums[i];

             if(valueMap.containsKey(prefixSum - k)) {
                res = res + valueMap.get(prefixSum-k);
            }
            valueMap.put(prefixSum, valueMap.getOrDefault(prefixSum, 0) + 1);

        }
        return res;
        
    }
}
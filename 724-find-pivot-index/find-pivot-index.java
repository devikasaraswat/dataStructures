class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int prefixSum  = 0;
        for(int i =0 ; i< nums.length; i++) {
            if(prefixSum == (totalSum - prefixSum - nums[i]))
                 return i;
            prefixSum = prefixSum + nums[i];

        }
        return -1;

    }
}
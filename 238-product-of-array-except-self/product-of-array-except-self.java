class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefixArray =  new int[length];
        int[] suffixArray = new int[length];
        int[] result = new int[length];

        prefixArray[0]=1;
        for(int i = 1;i<length;i++){
            prefixArray[i] = nums[i-1] * prefixArray[i-1];
        }

        suffixArray[length-1] = 1;
        for(int j = length-2;j>=0;j--) {
            suffixArray[j] = suffixArray[j+1] * nums[j+1];
        }

        for(int k = 0;k< length;k++) {
             result[k] = prefixArray[k] * suffixArray[k];
        }
        return  result;
    }
}
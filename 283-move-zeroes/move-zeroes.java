class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int k = 0;
        for(int i=0;i< length;i++){
            if(nums[i] != 0 ) {
                nums[k] = nums[i];
                k++;
            }
        }

        while(k< length) {
            nums[k] = 0;
            k++;
        }
        
    }
}
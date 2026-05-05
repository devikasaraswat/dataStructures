class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums== null || nums.length == 0 ) return 0;
        int i=0;
        for(int element: nums) {
            if(i<2 ||  element != nums[i-2]) {
                nums[i++] = element;
            }
        }
        return i;
    }
}
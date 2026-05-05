class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int low =0; 
        int high =length -1 ; 
        int mid =0;
        int index = -1;
        while(low<=high) {
            mid = low+(high-low)/2;
            if(nums[mid] == target ) {
                index = mid;
            }
            if(nums[low]<= nums[mid] ) {
                if(nums[low] <= target && target < nums[mid]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            } else {
                if(nums[mid] < target && target <=nums[high]) {
                    low=mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return index;
    }
}
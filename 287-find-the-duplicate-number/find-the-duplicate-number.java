class Solution {
    public int findDuplicate(int[] nums) {
        int duplicate = 0;
        Map<Integer, Integer> countMap  = new HashMap<>();
         for(int i =0 ;i< nums.length;i++) {
            if(countMap.get(nums[i]) == null) {
                countMap.put(nums[i] , 1);
            } else if(countMap.get(nums[i]) == 1) {
                duplicate=  nums[i];
            }
        }
        return duplicate;
    }
}
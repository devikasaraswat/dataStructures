class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        if(nums.length <4 || nums == null) {
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        for (int i =0; i< nums.length-3;i++) {
          
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int left = i + 1; left < nums.length - 2; left++) {

           
            if (left > i + 1 && nums[left] == nums[left - 1]) {
                continue;
            }
            int right = nums.length-1;
            int secondLeft = left+1;
            while(secondLeft < right) {
                long sum = (long)  nums[i]+ nums[right]+nums[left]+nums[secondLeft];
                if(sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[secondLeft] , nums[right]));
                    secondLeft++;
                    right--;
                  
                    while (secondLeft < right &&
                            nums[secondLeft] == nums[secondLeft - 1]) {
                        secondLeft++;
                    }

               
                    while (secondLeft < right &&
                            nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < target) {
                 //   left ++;
                    secondLeft++;

                } else {
                    right--;
                }
            }
        }
        }
        return new ArrayList<>(result);
    }
}
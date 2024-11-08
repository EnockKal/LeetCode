class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        if(nums.length == 1)
            return nums[0];

        int prev = Math.max(nums[0], nums[1]);
        int prev2 = nums[0];

        for(int i = 2; i < nums.length; i++){
            int current = Math.max(prev, prev2 + nums[i]);
            prev2 = prev;
            prev = current;
        }

        return prev;
    }
}
class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 return new int [] {i, j};
    //             }
    //         }
    //     }
    //     return new int[]{};
    // }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            myMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (myMap.containsKey(complement) && myMap.get(complement) != i){
                return new int[]{i, myMap.get(complement)};
            }
        }
        return new int[]{};
    }
}
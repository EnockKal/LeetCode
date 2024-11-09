class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxCount = 0;
        for(int[] customer : accounts){
            int costumerCount = 0;

            for(int bank : customer){
                costumerCount += bank;
            }

            if(costumerCount > maxCount){
                maxCount = costumerCount;
            }
        }

        return maxCount;
    }
}
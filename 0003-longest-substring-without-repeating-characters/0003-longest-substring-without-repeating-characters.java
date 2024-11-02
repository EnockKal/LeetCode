class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch) && map.get(ch) >= left){
                left = map.get(ch) + 1;
            }

            map.put(ch, i);
            count = Math.max(count, i - left + 1);
        }

        return count;
    }
}
class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for(char ch : s.toCharArray()){
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> max = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue());
        max.addAll(count.entrySet());

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        while(!max.isEmpty()){
            Map.Entry<Character, Integer> current = max.poll();
            result.append(current.getKey());

            if(prev != null && prev.getValue() > 0)
                max.offer(prev);
            
            current.setValue(current.getValue() - 1);
            prev = current;
        }
        return result.length() == s.length() ? result.toString() : "";
    }
}
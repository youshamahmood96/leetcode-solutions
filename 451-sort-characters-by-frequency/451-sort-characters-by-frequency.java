class Solution {
    public String frequencySort(String s) {
        String res = "";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Queue<Character> q = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char c:map.keySet()){
            q.offer(c);
        }
        while(!q.isEmpty()){
            char curr = q.poll();
            int limit = map.get(curr);
            for(int i=0;i<limit;i++){
                res+=curr;
            }
        }
        return res;
    }
}
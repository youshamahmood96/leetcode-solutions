class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Integer> q = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        Set<Integer> set = new HashSet<>();
        for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);
        for(int i:map.keySet()) q.offer(i);
        int len = arr.length;
        int curr = 0;
        while(curr<len/2){
            int temp = q.poll();
            set.add(temp);
            curr+=map.get(temp);
        }
        return set.size();
    }
}
class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int[] i:edges){
            if(map.containsKey(i[0])){
                Set<Integer> set = map.get(i[0]);
                set.add(i[1]);
                map.put(i[0],set);
            }
            else{
                Set<Integer> set = new HashSet<>();
                set.add(i[1]);
                map.put(i[0],set);
            }
            if(map.containsKey(i[1])){
                Set<Integer> set = map.get(i[1]);
                set.add(i[0]);
                map.put(i[1],set);
            }
            else{
                Set<Integer> set = new HashSet<>();
                set.add(i[0]);
                map.put(i[1],set);
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<restricted.length;i++){
            set.add(restricted[i]);
        }
        Queue<Integer> q = new LinkedList<>();
        set.add(0);
        q.add(0);
        int ans = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                ans++;
                int curr = q.remove();
                Set<Integer> currSet = map.get(curr);
                for(int i:currSet){
                if(set.add(i)){
                    q.add(i);
                }
            }
            }
        }
        return ans;
    }
}
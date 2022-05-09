class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] res = new int[t.length];
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<t.length;i++){
            while(!s.isEmpty() && t[s.peek()]<t[i]){
                int ans = s.pop();
                res[ans] = i-ans;
            }
            s.push(i);
        }
        return res;
    }
}
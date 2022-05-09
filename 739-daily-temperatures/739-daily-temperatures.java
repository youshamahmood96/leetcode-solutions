class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] res = new int[t.length];
        Stack<Integer> s = new Stack<>();
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
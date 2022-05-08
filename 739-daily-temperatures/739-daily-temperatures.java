class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] res = new int[t.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<t.length;i++){
            while(!stack.isEmpty() && stack.peek()<t[i]){
                    int temp = stack.pop();
                    int j = 1;
                    while(i-j>=0){
                       if(t[i-j]==temp){
                        t[i-j] = 0;
                        res[i-j] = j;
                        break;
                    }
                    else{
                        j++;
                    } 
                    }
            }
            stack.push(t[i]);
        }
        return res;
    }
}
class MinStack {
    List<Integer> arr;
    Queue<Integer> q;
    public MinStack() {
        arr = new ArrayList<>();
        q = new PriorityQueue<>();
    }
    
    public void push(int val) {
        q.offer(val);
        arr.add(val);
    }
    
    public void pop() {
        q.remove(arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
    }
    
    public int top() {
        return arr.get(arr.size()-1);
    }
    
    public int getMin() {
        return q.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
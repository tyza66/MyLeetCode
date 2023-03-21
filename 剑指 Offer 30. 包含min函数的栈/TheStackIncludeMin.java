class MinStack {
    Integer[] in = new Integer[10000];
    int index =  0;
    /** initialize your data structure here. */
    public MinStack() {

    }
    
    public void push(int x) {
        in[index++] = x;
    }
    
    public void pop() {
        index--;
    }
    
    public int top() {
        return in[index-1];
    }
    
    public int min() {
        int min = Collections.min(Arrays.asList(Arrays.copyOfRange(in,0,index)));
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
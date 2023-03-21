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
        in[index] = null;
    }
    
    public int top() {
        return in[index-1];
    }
    
    public int min() {
        int min = in[0];
        for(int i=0;i<=9999;i++){
            if(in[i]==null) break;
            if(in[i]<min) min = in[i];
        }
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
class CQueue {

    // 使用两个栈实现队列
    // 队列的特性就是新进后出 而栈的特性就是新进先出
    // 我的设想是这样的：
    // 将栈比作桶的话，我们可以像倒水一样，将一个桶的水倒入另一个桶中，这样就可以实现新进后出的效果
    private Stack<Integer> stack0;
    private Stack<Integer> stack1;
    private int mode;

    public CQueue() {
        // 主要往这里面存
        stack0 = new Stack<>();
        // 辅助栈 倒水的时候用的
        stack1 = new Stack<>();
    }

    public void appendTail(int value) {
        stack0.push(value);
    }

    public int deleteHead() {
        // 如果主栈为空，那么就返回-1
        if (stack0.isEmpty()) {
            return -1;
        }
        // 将主栈的元素倒入辅助栈中
        while (!stack0.isEmpty()) {
            stack1.push(stack0.pop());
        }
        // 弹出辅助栈的栈顶元素
        int end = stack1.pop();

        //将辅助栈中的内容倒回主栈中
        while (!stack1.isEmpty()) {
            stack0.push(stack1.pop());
        }
        return end;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
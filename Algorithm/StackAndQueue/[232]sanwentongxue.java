class MyQueue {

    /**
     * 利用 in out 两个栈 in用来做输入栈，out用作输出栈。pop和peek即可直接使用栈的方法，返回头部元素，实现队列先进先出的特性
     * Time complexity: push O(2n)   其他操作 O(1)
     * Space complexity: O(n)
     */
    Stack<Integer> in;
    Stack<Integer> out;

    /** Initialize your data structure here. */
    public MyQueue() {
        in = new Stack<Integer>();
        out = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!out.isEmpty()){
            in.push(out.peek());
            out.pop();
        }
        in.push(x);
        while(!in.isEmpty()){
            out.push(in.peek());
            in.pop();
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return out.pop();
    }

    /** Get the front element. */
    public int peek() {
        return out.  ();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return out.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

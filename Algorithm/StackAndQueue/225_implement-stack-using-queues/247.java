import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列a是暂时的操作队列，队列b是排好逆序的队列。
 * 时间复杂度，入栈o(n),其他操作O(1)
 * 空间复杂度o(n),两个队列
 */
class MyStack {
    private Queue<Integer> queuea;
    private Queue<Integer> queueb;

    /** Initialize your data structure here. */
    public MyStack() {
        queuea = new LinkedList<>();
        queueb = new LinkedList<>();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queuea.add(x);
        while (!queueb.isEmpty())
            queuea.add(queueb.poll());

        Queue temp = queuea;
        queuea = queueb;
        queueb = temp;
    }

    public int pop() {
        return queueb.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queueb.peek();

    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queueb.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
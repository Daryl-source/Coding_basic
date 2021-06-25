import java.util.PriorityQueue;

class KthLargest {
    /**
     * 主要使用到了一个经典队列，优先级队列。它的特点能够有序排列。只需要在每次add时，判断队列长度，大于K直接移除头部元素。
     * 利用它顺序排列的特点 最终的头元素即为第K大的数
     * Time complexity: O(logn)
     * Space complexity: O(k)
     */
    PriorityQueue<Integer> queue;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<Integer>();
        for (int i : nums){
            add(i);
        }
    }
    
    public int add(int val) {
        queue.offer(val);
        if(queue.size() > k){
            queue.poll();
        }
        return queue.peek();
    }
}


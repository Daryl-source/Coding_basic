/**
 * 用最小堆。堆顶元素是最小的，堆底的都比他大。所以第k大，就维护一个k大小的最小堆。
 * 时间复杂度 o（logk）因为是树
 * 空间复杂度 o（k）
 */
class KthLargest {
    private PriorityQueue<Integer> queue;
    private Integer n;

    public KthLargest(int k, int[] nums) {
        n = k;
        queue = new PriorityQueue<>(k);

        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }

    }

    public int add(int val) {
        if (queue.size() < n) {
            
            queue.add(val);
        }
        else if (val > queue.peek()){
            queue.poll();
            queue.add(val);
        }


        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
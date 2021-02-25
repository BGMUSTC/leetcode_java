package kth_largest_element_in_a_stream;

import java.util.PriorityQueue;

class KthLargest {

    final PriorityQueue<Integer> queue;
    final int ssize;
    public KthLargest(int k, int[] nums) {
        ssize = k;
        queue = new PriorityQueue<Integer>();
        for (int n:nums) {
            add(n);
        }
    }

    public int add(int val) {
        if(queue.size() < ssize || queue.peek() < val) {
            queue.offer(val);
        }
        if (queue.size() > ssize) {
            queue.poll();
        }
        return queue.peek();
    }
}

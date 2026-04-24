
import java.util.*;

class Solution {

    class Pair implements Comparable<Pair> {
        int ele, freq;

        Pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }

        public int compareTo(Pair that) {
            return this.freq - that.freq; // min-heap based on freq
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // push into heap
        for (int key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));

            if (pq.size() > k) {
                pq.poll(); // remove smallest freq
            }
        }

        int[] result = new int[k];

        // extract result
        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll().ele;
        }

        return result;
    }
}
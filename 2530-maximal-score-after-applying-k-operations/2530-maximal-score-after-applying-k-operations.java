class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(
            (a,b) -> Integer.compare(b,a)
        );
        for(int i : nums){
            queue.add(i);
        }
        long sum = 0;
        while(k-- > 0){
            int n = queue.poll();
            sum+=n;
            queue.add((int) (Math.ceil((double)n/3)));
        }
        return sum;
    }
}
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq  = new PriorityQueue<>(Collections.reverseOrder());
        for(int val:stones){
            pq.add(val);
        }
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            if(first!=second){
                int diff = Math.abs(first-second);                
                pq.add(diff);
            }
        }
        if(pq.isEmpty()) return 0;
        return pq.peek();
    }
}
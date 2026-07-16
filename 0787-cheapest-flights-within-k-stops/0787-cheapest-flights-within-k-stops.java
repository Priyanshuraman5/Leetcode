class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<flights.length;i++){
            int from = flights[i][0];
            int to = flights[i][1];
            int price = flights[i][2];
            adj.get(from).add(new int[]{to,price});
        }

        Queue<int[]> pq = new LinkedList<>();
        pq.add(new int[]{src,0,0});
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        while(!pq.isEmpty()){
            int[] poll = pq.poll();
            int node = poll[0];
            int val = poll[1];
            int stop = poll[2];
            if(stop>k) continue;
            for(int[] neigh:adj.get(node)){
                int nextNode = neigh[0];
                int nextVal = neigh[1];
                if(dist[nextNode]>val+nextVal){
                    dist[nextNode] = val + nextVal;
                    pq.add(new int[]{nextNode,dist[nextNode],stop+1});
                }
            }
        }
        return dist[dst]==Integer.MAX_VALUE ?  -1: dist[dst];

    }
}
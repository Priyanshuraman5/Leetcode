class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        List<List<int[]>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] f:flights){
            adj.get(f[0]).add(new int[]{f[1],f[2]});
        }

        int ans = Integer.MAX_VALUE;
        Queue<Pair> q = new LinkedList<>();
        int[] cost = new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        q.add(new Pair(src,0,0));
        cost[src] = 0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int node = p.node;
            int popcost = p.cost;
            int stops = p.stops;
            if(stops>k+1) continue;

            if(node == dst) {
                ans = Math.min(ans,popcost);
            }
            for(int[] curr : adj.get(node)){
                int neigh = curr[0];
                int currCost = curr[1];

                int newCost = currCost + popcost;
                if(newCost < cost[neigh]){
                    cost[neigh] = newCost;
                    q.add(new Pair(neigh,newCost,stops+1));
                }

            }
        }

        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;


    }
    class Pair{
        int node;
        int cost;
        int stops;
        public Pair(int node, int cost, int stops){
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
    }
}
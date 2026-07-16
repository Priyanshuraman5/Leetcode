class Solution {
    public List<Integer> eventualSafeNodes(int[][] edges) {
        int V = edges.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int[] inDeg = new int[V];
        for(int i=0;i<edges.length;i++){
            for(int v:edges[i]){
                adj.get(v).add(i);
                inDeg[i]++;
            }
        }
        
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDeg[i]==0) q.add(i);
        }
        int index = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            index++;
            ans.add(node);
            for(int neigh:adj.get(node)){
                inDeg[neigh]--;
                if(inDeg[neigh]==0) q.add(neigh);
            }
        }
        Collections.sort(ans);
        return ans;


    }
}
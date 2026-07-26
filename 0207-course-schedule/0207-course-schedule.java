class Solution {
    public boolean canFinish(int num, int[][] pre) {
        int n = pre.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<num;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++){
            int u = pre[i][0];
            int v = pre[i][1];
            adj.get(v).add(u);
        }
        int[] inDeg = new int[num];
        for(int i=0;i<num;i++){
            for(int neigh:adj.get(i)){
                inDeg[neigh]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<num;i++){
            if(inDeg[i]==0) q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()){
            int poll = q.poll();
            count++;
            for(int neigh:adj.get(poll)){
                inDeg[neigh]--;
                if(inDeg[neigh]==0) q.add(neigh);
            }
        }
        return count == num;

    }
}
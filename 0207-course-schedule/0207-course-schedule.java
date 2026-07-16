class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adj.get(v).add(u);
        }

        int[] inDeg = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int list : adj.get(i)){
                inDeg[list]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDeg[i]==0) q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int neigh:adj.get(node)){
                inDeg[neigh]--;
                if(inDeg[neigh]==0) q.add(neigh);
            }
        }
        return (count==numCourses) ;

        
        
    }
}
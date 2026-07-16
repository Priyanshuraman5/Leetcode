class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
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
            for(int it:adj.get(i)){
                inDeg[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDeg[i]==0) q.add(i);
        }
        int[] ans = new int[numCourses];
        int index = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            ans[index++] = node;
            for(int neigh:adj.get(node)){
                inDeg[neigh]--;
                if(inDeg[neigh]==0) q.add(neigh);
            }
        }
        if(index==numCourses){
            return ans;
        }
        
        return new int[0];
    }
}
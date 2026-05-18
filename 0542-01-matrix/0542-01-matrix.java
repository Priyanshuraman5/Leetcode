class Solution {
    class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        boolean[][] isVis = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0) {
                    q.add(new Pair(i,j));
                    isVis[i][j] = true;
                }
            }
        }
        while(!q.isEmpty()){
            Pair p = q.poll();
            int currR = p.row;
            int currC = p.col;
            int[]remR = {-1,1,0,0};
            int[]remC = {0,0,-1,1};
            for(int i=0;i<4;i++){
                int newR = currR + remR[i];
                int newC = currC + remC[i];
                if(newR>=0 && newC>=0 && newR<m && newC<n && mat[newR][newC]==1 && !isVis[newR][newC]){
                    isVis[newR][newC] =true;
                    q.add(new Pair(newR,newC));
                    ans[newR][newC] = 1 + ans[currR][currC];
                }
                
            }
            
        }
        return ans;


    }
}
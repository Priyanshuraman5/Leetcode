class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] isVis = new boolean[m][n];
        for(int i=0;i<m;i++){
            if(grid[i][0]==1 && !isVis[i][0]){
                bfs(grid,i,0,isVis);
            }
        }

        for(int i=0;i<n;i++){
            if(grid[0][i]==1 && !isVis[0][i]){
                bfs(grid,0,i,isVis);
            }
        }

        for(int i=0;i<n;i++){
            if(grid[m-1][i]==1 && !isVis[m-1][i]){
                bfs(grid,m-1,i,isVis);
            }
        }

        for(int i=0;i<m;i++){
            if(grid[i][n-1]==1 && !isVis[i][n-1]){
                bfs(grid,i,n-1,isVis);
            }
        }
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !isVis[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public void bfs(int[][]grid, int i, int j, boolean[][]isVis ){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        isVis[i][j] = true;
         while(!q.isEmpty()){
            Pair p = q.poll();
            int pRow = p.row;
            int pCol = p.col;
            int[] remRow = {0,0,-1,1};
            int[] remCol = {1,-1,0,0};
            for(int k=0;k<4;k++){
                int newRow = remRow[k] + pRow;
                int newCol = remCol[k] + pCol;
                if(newRow>=0 && newCol>=0 && newRow<m && newCol<n && grid[newRow][newCol]==1 && !isVis[newRow][newCol]){
                    isVis[newRow][newCol] = true;
                    q.add(new Pair(newRow,newCol));
                }
            }
        }
    }
}
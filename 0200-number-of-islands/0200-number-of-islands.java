class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] isVis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !isVis[i][j]){
                    bfs(grid,i,j,isVis);
                    count++;
                }
            }
        }
        return count;
    }
    class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public void bfs(char[][] isConnected,int row, int col,boolean[][] isVis){
        int m = isConnected.length;
        int n = isConnected[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        isVis[row][col] = true;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int currRow = p.row;
            int currCol = p.col;
            int[] remRow = {1,-1,0,0};
            int[] remCol = {0,0,-1,1};
            for(int i=0;i<4;i++){
                int newRow = remRow[i] + currRow;
                int newCol = remCol[i] + currCol;
                if(newRow>=0 && newCol>=0 && newRow<m && newCol<n && isConnected[newRow][newCol]=='1' && !isVis[newRow][newCol]){
                    q.add(new Pair(newRow,newCol));
                    isVis[newRow][newCol] = true;
                }
            }
        }
    }
}
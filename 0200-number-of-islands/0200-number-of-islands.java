class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] isVis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1'&&!isVis[i][j]){
                    bfs(grid,i,j,isVis);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(char[][] grid, int i, int j, boolean[][]isVis){
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
                if(newRow>=0 && newCol>=0 && newRow<m && newCol<n && grid[newRow][newCol]=='1' && !isVis[newRow][newCol]){
                    isVis[newRow][newCol] = true;
                    q.add(new Pair(newRow,newCol));
                }
            }
        }
    }
}
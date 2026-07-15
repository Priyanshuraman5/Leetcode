class Solution {
    class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0) continue;
                else if(grid[i][j] == 1) fresh++;
                else{
                    q.add(new Pair(i,j));
                }
            }
        }
        boolean[][] isVis = new boolean[m][n];
        if(fresh==0) return 0;
        int minutes = -1;
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size!=0){
                Pair p = q.poll();
                int currRow = p.row;
                int currCol = p.col;
                int[] remRow = {1,-1,0,0};
                int[] remCol = {0,0,-1,1};
                for(int i=0;i<4;i++){
                    int newRow = remRow[i] + currRow;
                    int newCol = remCol[i] + currCol;
                    if(newRow>=0 && newCol>=0 && newRow<m && newCol<n && grid[newRow][newCol]==1 && !isVis[newRow][newCol]){
                        q.add(new Pair(newRow,newCol));
                        isVis[newRow][newCol] = true;
                        fresh--;
                    }
                }
                size--;
            }
            minutes++;
        }
        if(fresh!=0) return -1;
        return minutes;

    }
}
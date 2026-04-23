class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
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
                if(grid[i][j]==1) fresh++;
                else if(grid[i][j]==2) q.add(new Pair(i,j));
            }
        }
        if(fresh==0) return 0;
        boolean[][] isVis = new boolean[m][n];
        int minutes = 0;
        while(!q.isEmpty()){
            int size = q.size();
            boolean flag = false;
            while(size!=0){
                Pair p = q.poll();
                int pRow = p.row;
                int pCol = p.col;
                int[] remRow = {0,-1,0,1};
                int[] remCol = {1,0,-1,0};
                for(int i=0;i<4;i++){
                    int newRow = remRow[i] + pRow;
                    int newCol = remCol[i] + pCol;
                    if(newRow>=0 && newCol>=0 && newRow<m && newCol<n && grid[newRow][newCol]==1 && !isVis[newRow][newCol]){
                        isVis[newRow][newCol] = true;
                        q.add(new Pair(newRow,newCol));
                        flag = true; 
                        grid[newRow][newCol] = 2;
                        fresh--;
                    }
                }
                size--;
            }
            if(flag) minutes++;
        }
        if(fresh!=0) return -1;
        return minutes;
    }
}
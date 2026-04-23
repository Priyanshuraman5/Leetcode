class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cntZero = 0;
        int row = 0;
        int col = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0) cntZero++;
                else if(grid[i][j]==1) {
                    row = i;
                    col = j;
                }
            }
        }
        return helper(grid,row,col,cntZero);
    }
    public int helper(int[][]grid, int i, int j,int cntZero){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n||grid[i][j]==-1) return 0;
        if(grid[i][j]==2) {
            if(cntZero==-1){
                return 1;
            }
            else{
                return 0;
            }
        }
        grid[i][j] = -1;
        cntZero--;
        int left = helper(grid,i-1,j,cntZero);
        int right= helper(grid,i+1,j,cntZero);
        int down = helper(grid,i,j+1,cntZero);
        int up = helper(grid,i,j-1,cntZero);
        grid[i][j] = 0;
        cntZero++;
        return up+down+left+right;
    }
}
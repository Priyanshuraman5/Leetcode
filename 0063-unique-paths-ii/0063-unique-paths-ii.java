class Solution {
    Integer[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        dp = new Integer[m][n];
        return helper(obstacleGrid,m,n,0,0);
    }
    public int helper(int[][]obstacleGrid, int m, int n, int i, int j){
        if((i>=m || j>=n )||obstacleGrid[i][j]==1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(obstacleGrid[i][j]==1) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int pick1 = helper(obstacleGrid,m,n,i+1,j);
        int pick2 = helper(obstacleGrid,m,n,i,j+1);

        return dp[i][j] = pick1 + pick2;
    }
}
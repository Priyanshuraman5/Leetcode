class Solution {
    int[][]dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        dp = new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(obstacleGrid,0,0);
    }
    public int helper(int[][]obstacleGrid,int i,int j){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(i>=m || j>=n) return 0;
        if(obstacleGrid[i][j]==1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int right = helper(obstacleGrid,i+1,j);
        int down = helper(obstacleGrid,i,j+1);
        return dp[i][j] = right+down;
    }
}
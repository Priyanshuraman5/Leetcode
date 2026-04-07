// class Solution {    
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int m = obstacleGrid.length;
//         int n = obstacleGrid[0].length;
//         dp = new int[m][n];
//         for(int[] row:dp){
//             Arrays.fill(row,-1);
//         }
//         return helper(obstacleGrid,0,0);
//     }
//     public int helper(int[][]obstacleGrid,int i,int j){
//         int m = obstacleGrid.length;
//         int n = obstacleGrid[0].length;
//         if(i>=m || j>=n) return 0;
//         if(obstacleGrid[i][j]==1) return 0;
//         if(i==m-1 && j==n-1) return 1;
//         if(dp[i][j]!=-1) return dp[i][j];
//         int right = helper(obstacleGrid,i+1,j);
//         int down = helper(obstacleGrid,i,j+1);
//         return dp[i][j] = right+down;
//     }
//     int[][]dp;
// }
class Solution {    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m+1][n+1];
        dp[0][1] =1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(obstacleGrid[i-1][j-1]==1) dp[i][j] = 0;
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }
}
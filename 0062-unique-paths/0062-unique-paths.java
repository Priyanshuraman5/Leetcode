// class Solution {
//     public int unique(int m, int n,int[][]dp) {
//         if(m==0 && n==0) return 1;
//         if(m<0 || n<0) return 0;
//         if(dp[m][n]!=-1) return dp[m][n];
//         int up = unique(m-1,n,dp);
//         int left = unique(m,n-1,dp);
//         return dp[m][n]=up+left;
//     }
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 dp[i][j]=-1;
//             }
//         }
//         return unique(m-1,n-1,dp);
//     }
// }
// class Solution {
//     public int uniquePaths(int m, int n){
//         int[][] dp = new int[m+1][n+1];
//         dp[0][1] = 1;
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=n;j++){
//                 dp[i][j] = dp[i-1][j] + dp[i][j-1];
//             }
//         }
//         return dp[m][n];
//     }
// }
class Solution {
    public int uniquePaths(int m, int n){
        int[]dp = new int[n];
        dp[0] = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(m==0 && n==0) dp[j] = 1;
                else if(j>0){
                    dp[j] = dp[j]+dp[j-1];
                }
            }
        }
        return dp[n-1];
    }

}
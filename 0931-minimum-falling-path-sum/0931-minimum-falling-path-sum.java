class Solution {
    Integer[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        
        int n = matrix.length;
        dp = new Integer[n][n];
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans = Math.min(ans,helper(matrix,0,i,n));
        }
        return ans;
    }
    public int helper(int[][]matrix, int i, int j, int n){
        if(i>=n || j>=n || j<0) return Integer.MAX_VALUE;
        if(i==n-1) return matrix[i][j];
        if(dp[i][j]!=null) return dp[i][j];
        int   path1 = helper(matrix,i+1,j-1,n);
        
     
        int   path2 = helper(matrix,i+1,j,n) ;
        int   path3 = helper(matrix,i+1,j+1,n) ;
        

        return dp[i][j] = Math.min(path1 , Math.min(path2,path3)) + matrix[i][j];
    }
}
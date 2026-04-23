class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int col=0;col<=amount;col++){
            if(col%coins[0]==0) {
                dp[0][col] = col/coins[0];
            }
            else{
                dp[0][col] = Integer.MAX_VALUE;
            }
        }
        for(int row=1;row<n;row++){
            for(int col=0;col<=amount;col++){
                int exclude = dp[row-1][col];
                int include = Integer.MAX_VALUE;
                if(coins[row]<=col && dp[row][col-coins[row]] != Integer.MAX_VALUE){
                    include = 1 + dp[row][col-coins[row]];
                }
                dp[row][col] = Math.min(include,exclude);
                
            }
        }
        if(dp[n-1][amount]==Integer.MAX_VALUE) return -1;
        return dp[n-1][amount];
    }
}
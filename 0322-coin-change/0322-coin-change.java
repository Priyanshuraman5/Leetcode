// class Solution {
//     Integer[][] dp;
//     public int coinChange(int[] coins, int amount) {
//         dp = new Integer[coins.length][amount+1];
       
//         int ans = helper(coins,amount,0);
//         if(ans>= 400000) return -1;
//         return ans;
//     }
//     public int helper(int[] coins, int amount, int idx){
//         if(amount==0) return 0;

//         if(idx>=coins.length) return 400000;

//         if(dp[idx][amount]!=null) return dp[idx][amount];
//         int pick = Integer.MAX_VALUE;

//         if(amount>=coins[idx]){
//             pick = helper(coins,amount-coins[idx],idx) + 1;
//         }
//         int skip = helper(coins,amount,idx+1);

//         return dp[idx][amount] = Math.min(pick,skip);
//     }
// }

class Solution{
    public int coinChange(int[] coins, int amount){
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        
        for(int i=1;i<=amount;i++){
            dp[0][i] = 400000;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                int skip = dp[i-1][j];
                int pick = 400000;
                if(j>=coins[i-1]){
                    pick = 1 + dp[i][j-coins[i-1]];
                }
                dp[i][j] = Math.min(pick,skip);
            }
        }
        if(dp[n][amount]>=400000){
            return -1;
        }
        return dp[n][amount];
    }
}
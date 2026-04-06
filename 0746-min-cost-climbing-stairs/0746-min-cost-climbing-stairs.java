// class Solution {
//     int[] dp;
//     public int helper(int[] cost,int idx,int n){
//         if(idx==n) return cost[idx];
//         if(idx>n) return 0;
//         if(dp[idx]!=-1) return dp[idx];
//         int take1 = helper(cost,idx+1,n)+cost[idx];
//         int take2 = helper(cost,idx+2,n)+cost[idx];
//         return dp[idx]=Math.min(take1,take2);
//     }
//     public int minCostClimbingStairs(int[] cost) {
//         dp = new int[cost.length+1];
//         Arrays.fill(dp,-1);
//         int ans = Math.min(helper(cost,0,cost.length-1),helper(cost,1,cost.length-1));
//         return ans;
//     }
// }
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+2];
        dp[n] = 0;
        dp[n+1] = 0;
        for(int i=n-1;i>=0;i--){
            dp[i] =   Math.min(dp[i+1]+cost[i],dp[i+2]+cost[i]);
        }
        return Math.min(dp[0],dp[1]);
    }
}
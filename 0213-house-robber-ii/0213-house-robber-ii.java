// class Solution {
//     int dp[];
//     public int helper(int[]nums, int idx, int n){
//         if(idx>n) return 0;
//         if(dp[idx]!=-1) return dp[idx];
//         int take = helper(nums,idx+2,n) + nums[idx];
//         int skip = helper(nums,idx+1,n) ;
//         return dp[idx]=Math.max(take,skip);
//     }
//     public int rob(int[] nums) {
//         int n = nums.length;
//         dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         if(n==1) return nums[0];
//         int case1 = helper(nums,0,n-2);
//         dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         int case2 = helper(nums,1,n-1);
//         return Math.max(case1,case2);
//     }
// }
class Solution {
    public int rob(int[] nums){
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n+2];
        for(int i=n-1;i>=1;i--){
            dp[i] =  Math.max( dp[i+1] , dp[i+2] + nums[i]);
        }
        int[] dp1 = new int[n+2];
        for(int i=n-2;i>=0;i--){
            dp1[i] = Math.max(dp1[i+1] , dp1[i+2] + nums[i]);
        }
        return Math.max(dp[1],dp1[0]);
    }
}
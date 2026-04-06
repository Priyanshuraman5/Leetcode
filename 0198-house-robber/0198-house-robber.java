// class Solution {
//     int dp[];
//     public int rob(int[] nums) {
//         int n = nums.length;
//         dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         return helper(nums,0,n);
//     }
//     public int helper(int[] nums,int idx,int n){
//         if(idx==n) return 0;
//         if(idx>n)  return 0;
//         if(dp[idx]!=-1) return dp[idx];
//         int take = helper(nums,idx+2,n)+nums[idx];
//         int skip = helper(nums,idx+1,n);
//         return dp[idx]=Math.max(take, skip);
//     }
// }
class Solution {
    
    public int rob(int[] nums) {
        int n = nums.length;
        int[]dp = new int[n+2];
        for(int i=n-1;i>=0;i--){
            dp[i] = Math.max(dp[i+1],dp[i+2]+nums[i]);
        }
        return dp[0];
    }
}

class Solution {
    Integer[][] dp;
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new Integer[n+1][n+1];
        return helper(nums,-1,0,n);
    }
    public int helper(int[]nums, int prev, int idx, int n){
        if(idx>=n) return 0;
        if(dp[prev+1][idx]!=null) return dp[prev+1][idx];
        int skip = helper(nums,prev,idx+1,n);
        int pick = 0;
        if(prev==-1 || nums[idx]>nums[prev]){
            pick = 1 + helper(nums,idx,idx+1,n);
        }
        return dp[prev+1][idx] = Math.max(pick,skip);
    }
}
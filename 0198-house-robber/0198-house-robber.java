class Solution {
    Integer[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new Integer[n];
        return helper(nums,0);
    }

    public int helper(int[] nums, int idx){
        int n = nums.length;
        if(idx>=n) return 0;
        if(dp[idx]!=null) return dp[idx];
        int skip = helper(nums,idx+1);
        int pick = helper(nums,idx+2) + nums[idx];

        return dp[idx] = Math.max(pick, skip);
    }
}
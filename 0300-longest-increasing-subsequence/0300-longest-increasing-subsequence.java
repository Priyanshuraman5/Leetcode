class Solution {
    Integer[][] dp;
    public int lengthOfLIS(int[] nums) {
        dp = new Integer[nums.length+1][nums.length+1];
        return helper(nums,0,-1);
    }
    public int helper(int[] nums, int idx,int prev){
        if(idx==nums.length) return 0;
        if(dp[prev+1][idx]!=null) return dp[prev+1][idx];
        int pick =0;
        if(prev==-1 || nums[idx]>nums[prev] ){
            pick =  1+helper(nums,idx+1,idx);
        }
        int skip = helper(nums,idx+1,prev);
        return dp[prev+1][idx] = Math.max(pick,skip);

    }
}
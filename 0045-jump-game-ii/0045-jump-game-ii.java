class Solution {
    Integer[]dp;
    public int jump(int[] nums) {
        dp = new Integer[nums.length];
        return helper(nums,0);
    }
    public int helper(int[] nums,int idx){
        if(idx>=nums.length-1) return 0;
        if(dp[idx]!=null) return dp[idx];
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=nums[idx];i++){
            int ans = helper(nums,idx+i);
            if(ans!=Integer.MAX_VALUE) min = Math.min(min,1+ans);
        }
        return dp[idx] =  min;
    }
}
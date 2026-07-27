class Solution {
    Integer[] dp;
    public int deleteAndEarn(int[] nums) {
        int  n = nums.length;
        int max = 0;
        for(int num:nums){
            max = Math.max(num,max);
        }
        int[] earn = new int[max+1];
        dp = new Integer[earn.length];
        for(int num:nums){
            earn[num] = earn[num] + num;
        }

        return helper(earn,0);
    }
    public int helper(int[] earn, int idx){
        if(idx>=earn.length) return 0;
        if(dp[idx]!=null) return dp[idx];
        int pick = helper(earn,idx+2) + earn[idx];

        int skip = helper(earn,idx+1);

        return dp[idx] = Math.max(pick,skip);
    }
}
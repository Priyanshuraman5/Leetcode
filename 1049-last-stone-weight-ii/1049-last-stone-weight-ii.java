class Solution {
    Integer[][] dp;
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int val:stones){
            sum += val;
        }
        int target = sum/2;
        dp = new Integer[stones.length][target+1];
        int output = helper(stones, 0, target);
        // if(output==0) return 0;
        return sum - 2*output;
        

    }
    public int helper(int[]stones, int idx, int target){
        if(target==0) return 0;
        if(idx>=stones.length) return 0;
        if(dp[idx][target]!=null) return dp[idx][target];
        int skip = helper(stones,idx+1,target);
        int pick = 0;
        if(target>=stones[idx]){
            pick = stones[idx] + helper(stones,idx+1,target-stones[idx]);
        }
        return dp[idx][target] = Math.max(pick,skip);
    }

}
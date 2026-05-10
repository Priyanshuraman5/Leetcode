class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for(int i=0;i<n;i++){
            if(dp[i]==-1) continue;
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[j]-nums[i])<=target){
                    dp[j] = Math.max(dp[j],dp[i]+1);
                }
            }
        }
        return dp[n-1];
    }
}
//         if(target==0) return -1;
//         int n = nums.length;
//         int count = 0;
//         int i=0;
//         int j = 1;
//         while(i<n-1 && j<n){
//             int sub = Math.abs(nums[j] - nums[i]);
//             if(sub<=target){
//                 count++;
//                 i=j;
//                 j++;
//             }
//             else{
//                 j++;
//             }
//         }
//         if(i!=n-1) return -1;
//         return count;
//     }
// }
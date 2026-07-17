// class Solution {
//     public int jump(int[] nums) {
//         int n = nums.length;
        
//         return helper(nums,0,n);
//     }
//     public int helper(int[]nums, int idx,int n){
//         if(idx==n-1) return 0;

//         if(idx>=n) return Integer.MAX_VALUE;
//         int pick = Integer.MAX_VALUE;
//         for(int i=idx+1;i<=Math.min(nums[idx]+idx,n-1);i++){
//             int temp= helper(nums,i,n);
//             if(temp!=Integer.MAX_VALUE){
//                 pick =  Math.min(1 +temp,pick);
//             }
//         }
//         return pick;
//     }
// }

class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int maxidx = 0;
        int curr = 0;
        int step = 0;
        for(int i=0;i<n-1;i++){
            maxidx = Math.max(maxidx,i+nums[i]);
            if(i==curr){
                step++;
                curr = maxidx;
            }
        }
        return step;
    }
}
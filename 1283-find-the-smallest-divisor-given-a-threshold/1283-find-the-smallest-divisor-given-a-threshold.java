class Solution {
    int smallestDivisor(int[] nums, int k) {
        // Code here
        int n = nums.length;
        // int min = nums[0];
        int max = nums[0];
        int ans = 0;
        for(int i=1;i<n;i++){
            // min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        // if(min == max) return min;
        
        int st = 1;
        int en = max;
        while(st<=en){
            int mid = st + (en - st)/2;
            int num = 0;
            for(int i=0;i<n;i++){
                num += Math.ceil((double)nums[i]/mid);
            }
            if(num<=k){
                ans = mid;
                en = mid-1;
            }
            else{
                st = mid + 1;
            }
        }
        return ans;
    }
}
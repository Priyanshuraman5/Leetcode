class Solution {
    public int minDays(int[] nums, int m, int k) {
        int n = nums.length;
        if(((long)m*k) > n) return -1;
        int max = nums[0];
        int min = nums[0];
        for(int i=1;i<n;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }

        int sta = min;
        int end = max;
        int ans = max;

        while(sta <= end){
            int mid = sta + (end - sta)/2;
            int bloom = 0;
            int bouq = 0;
            for(int i=0;i<n;i++){
                if(nums[i]<=mid){
                    bloom++;
                }
                else{
                    bouq += (bloom/k);
                    bloom = 0;
                } 
            }
            bouq += bloom/k;
            if(bouq >= m){
                ans = mid;
                end = mid - 1;
            }
            else{
                sta = mid + 1;
            }
        }
        return ans;
    }
}
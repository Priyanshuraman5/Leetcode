class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = piles[0];
        for(int i=1;i<n;i++){
            max = Math.max(piles[i],max);
        }
        int sta = 1;
        int end = max;
        int ans = 0;
        while(sta<=end){
            int mid = sta + (end - sta)/2;
            int hours = 0;
            for(int i=0;i<n;i++){
                hours +=  Math.ceil((double)piles[i] / mid);
            }
            if(hours<=h){
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
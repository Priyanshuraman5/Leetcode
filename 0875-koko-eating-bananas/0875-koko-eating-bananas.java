class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = piles[0];
        for(int i=1;i<n;i++){
            max = Math.max(piles[i],max);
        }
        int start = 1;
        int end = max;
        int ans = max;
        while(start<=end){
            int mid = start + (end - start)/2;
            int hours = 0;
            for(int i=0;i<n;i++){
                hours += Math.ceil(((double)piles[i])/mid);
            }
            if(hours<=h){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
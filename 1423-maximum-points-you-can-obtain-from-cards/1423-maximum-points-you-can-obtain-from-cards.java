class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        int total = 0;
        int j = n-1;
        for(int i=0;i<k;i++){
            total+=cardPoints[i];
        }
        int ans = total;
        for(int i=0;i<k;i++){
            total = total - cardPoints[k-i-1];

            total = total + cardPoints[j-i];

            ans = Math.max(ans,total);
        }
        return ans;
    }
}
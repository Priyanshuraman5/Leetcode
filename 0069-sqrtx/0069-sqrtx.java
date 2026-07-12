class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int n = x;

        int sta = 0;
        int end = n;
        int ans = 0;

        while(sta<=end){
            int mid = sta + (end - sta)/2;
            long sq =(long) mid * mid;
            if(sq==x){
                return mid;
            }
            else if(sq<x){
                ans = mid;
                sta = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;

    }
}
class Solution {
    public long countCommas(long n) {
        if(n<999) return 0;
        
        long start = 1000;
        long ans = 0;
        long end = n;
        int comma = 1;
        while(start<=end){
            long en = start*1000-1;
            long count = Math.min(en,end)-start+1;
            if(count>0) ans +=count*comma;
            start *= 1000;
            comma++;
        }
        return ans;
        
    }
}
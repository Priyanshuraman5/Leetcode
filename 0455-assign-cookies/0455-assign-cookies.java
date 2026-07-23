class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = s.length;
        int n = g.length;
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<n && j<m){
            if(g[i]<=s[j]){
                i++;
                count++;
            }
            j++;
            
        }
        return count;
    }
}
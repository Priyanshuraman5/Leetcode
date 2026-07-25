class Solution {
    Boolean[][] dp;
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        dp = new Boolean[m][n];
        return helper(s,p,0,0);
    }

    public boolean helper(String s, String p, int i, int j){
        int m = s.length();
        int n = p.length();
        if(i==m && j==n){
            return true;
        }

        if(j==n) return false;

        if(i==m){
            while(j<n){
                if(p.charAt(j)!='*'){
                    return false;
                }
                j++;
            }
            return true;
        }
        if(dp[i][j]!=null) return dp[i][j];

        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            return dp[i][j] = helper(s,p,i+1,j+1);
        }
        if(p.charAt(j)=='*'){
            return dp[i][j] = helper(s,p,i+1,j) || helper(s,p,i,j+1);
        }
        return dp[i][j] = false;

    }
}
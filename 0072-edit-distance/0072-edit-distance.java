class Solution {
    Integer[][] dp;
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        dp = new Integer[m][n];
        return helper(word1,word2,m-1,n-1);
    }
    public int helper(String word1, String word2, int i, int j){
        if( i<0 ) return j+1;
        if( j<0 ) return i+1;

        if(dp[i][j] != null) return dp[i][j];

        if(word1.charAt(i)==word2.charAt(j)) return helper(word1,word2,i-1,j-1);

        else{
            int replace = helper(word1,word2,i-1,j-1);
            int insert =  helper(word1,word2,i-1,j);
            int delete =  helper(word1,word2,i,j-1);
            int max = 1 + Math.min(replace,Math.min(insert,delete));
            return dp[i][j] = max;
        }
    }
}
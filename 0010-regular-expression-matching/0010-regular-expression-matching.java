class Solution {
    Boolean[][] dp;

    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length() + 1][p.length() + 1];
        return helper(s, p, 0, 0);
    }

    public boolean helper(String s, String p, int i, int j) {
        int m = s.length();
        int n = p.length();

        if (dp[i][j] != null)
            return dp[i][j];

        if (j == n)
            return dp[i][j] = (i == m);

        boolean firstMatch = i < m &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        if (j + 1 < n && p.charAt(j + 1) == '*') {
            return dp[i][j] =
                    helper(s, p, i, j + 2) ||
                    (firstMatch && helper(s, p, i + 1, j));
        }

        return dp[i][j] =
                firstMatch && helper(s, p, i + 1, j + 1);
    }
}
/**
 * Author:Viper
 * Data:2021/3/14
 * description:
 */
public class problem19 {

    public boolean isMatch(String s, String p) {
        int n = s.length() + 1;
        int m = p.length() + 1;
        boolean[][] dp = new boolean[n][m];
        dp[0][0] = true;
        for (int j = 2; j < m; j += 2) {
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = p.charAt(j - 1) == '*' ? dp[i][j - 2] || s.charAt(i - 1) == p.charAt(j - 2) && dp[i - 1][j] ||
                        dp[i - 1][j] && p.charAt(j - 1) == '.' : s.charAt(i - 1) == p.charAt(j - 1) && dp[i - 1][j - 1] ||
                        p.charAt(j - 1) == '.' && dp[i - 1][j - 1];
            }

        }

        return dp[n - 1][m - 1];
    }
}

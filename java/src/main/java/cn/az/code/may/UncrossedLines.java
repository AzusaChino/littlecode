package cn.az.code.may;

/**
 * @author az
 * @date 2020/5/25
 */
public class UncrossedLines {

    public int maxUncrossedLines1(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int[][] dp = new int[m][n];


        return dp[m - 1][n - 1];
    }

    public int maxUncrossedLines(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[m][n];
    }


}

bool repeatedSubstringPattern(string str) {
    // i is the running ptr, j is the interval of repeated substring
    int i = 1, j = 0, n = str.size();
    vector<int> dp(n + 1, 0);
    while (i < str.size()) {
        if (str[i] == str[j]) dp[++i] = ++j;
        else if (j == 0) i++;
        else j = dp[j]; // reset j to 0
    }
    return dp[n] && dp[n] % (n - dp[n]) == 0;
}
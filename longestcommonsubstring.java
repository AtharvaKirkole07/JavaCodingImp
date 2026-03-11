class LongestCommonSubstring {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "zabcf";

        int m = str1.length();
        int n = str2.length();
        int maxLength = 0;
        int end = 0; // To store the ending point of the longest common substring

        // Create a 2D array to store lengths of longest common suffixes of substrings
        int[][] dp = new int[m + 1][n + 1];

        // Build the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        end = i; // Update the ending index of the longest substring
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        // The longest common substring is from end - maxLength to end in str1
        String longestCommonSubstring = str1.substring(end - maxLength, end);
        System.out.println("Longest Common Substring: " + longestCommonSubstring);
    }
}

class Solution {
    public static int solve(String str1, String str2, int n, int m, int[][] dp){

        // int[][] dp = new int[n+2][m+2];
        // for(int i = 0; i<n+2; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        //base
        if(n < 0 || m< 0){
            return 0;
        }
        else if(dp[n+1][m+1] != -1){
            return dp[n+1][m+1];
        }
        //recursive
        if(str1.charAt(n) == str2.charAt(m)){
            dp[n+1][m+1] = 1 + solve(str1, str2, n-1, m-1, dp);
        }
        else{
            dp[n+1][m+1] = Math.max(solve(str1, str2, n, m-1,dp), solve(str1, str2, n-1, m, dp));
        }
        return dp[n+1][m+1];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i = 0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        int length = solve(text1, text2, text1.length()-1, text2.length()-1, dp);
        return length;
    }
}
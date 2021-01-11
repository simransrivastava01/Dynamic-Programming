class LCS{
    
    // function to find LCS
    static int lcs(int p, int q, String s1, String s2){
        // your code here
        int dp[][] = new int[p+1][q+1];
        
        for(int i=1;i<=p;i++)
        {
            for(int j=1;j<=q;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                 {
                    dp[i][j] = 1 + dp[i-1][j-1]; 
                 }
                else
                 {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                 }
            }
        }
        return dp[p][q];
    }
class LCS{
    
    // function to find LCS
    static int lcs(int p, int q, String s1, String s2){
        // your code here
        int dp[][] = new int[p+1][q+1];
        
        if(p==0 || q==0)
          return 0;
        
        if(dp[p][q]!=0)
          return dp[p][q];
        
        if(s1.charAt(p-1)==s2.charAt(q-1))
        {
            return dp[p][q] = 1 + lcs(p-1,q-1,s1,s2);
        }
        else
        {
            return dp[p][q] = Math.max(lcs(p-1,q,s1,s2),lcs(p,q-1,s1,s2));
        }
    }
    
}
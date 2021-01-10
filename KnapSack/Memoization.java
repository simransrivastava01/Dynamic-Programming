class Knapsack 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int dp[][] = new int[n+2][W+2];
         if(n==0 || W==0)
         {
             return 0;
         }
         if(dp[n-1][W]!=0)
         {
             return dp[n-1][W];
         }
    
         if(wt[n-1]>W)
         {
             return dp[n-1][W]=knapSack(W,wt,val,n-1);
         }
         
        return dp[n-1][W]=Math.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1),
                             knapSack(W,wt,val,n-1));
    } 
}

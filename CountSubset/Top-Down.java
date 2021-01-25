/* Count Subset Problem (Top-Down) */

import java.util.*;

class GFG {
    public static boolean CountSubset(int arr[], int n, int sum)
    {
        boolean dp[][] = new boolean[n+1][sum+1];
        
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=true;
        }
        
        for(int j=1;j<=sum;j++)
        {
            dp[0][j]=false;
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
	public static void main (String[] args) {
	   Scanner obj = new Scanner(System.in);
	   int n=obj.nextInt();
	   int arr[] = new int[n];
	   for(int i=0;i<n;i++)
	   {
	       arr[i]=obj.nextInt();
	   }
	   int sum=obj.nextInt();
	   
	   System.out.print(CountSubset(arr,n,sum));
	}
}

/* Count Subset Problem (Bottom-Up) */

import java.util.*;

class GFG {
    public static boolean CountSubset(int arr[], int n, int sum)
    {
        if(n==0)
          return false;
        
        if(sum==0)
          return true;
          
        boolean dp[][] = new boolean[n+1][sum+1];
        
        if(dp[n][sum]!=false)
        {
            return dp[n][sum];
        }
        
        if(arr[n-1]<=sum)
          {
            dp[n][sum] = CountSubset(arr,n-1,sum-arr[n-1]) + CountSubset(arr,n-1,sum);
          }
        else
          {
            dp[n][sum] = CountSubset(arr,n-1,sum);
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

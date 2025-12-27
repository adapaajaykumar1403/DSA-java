class Solution {
    public int climbStairs(int n) {
      //recursive or backtracking method---------
        // if(n==0)
        // {
        //     return 1;
        // }
        // if(n<0)
        // {
        //     return 0;
        // }
        // int x=climbStairs(n-1);
        // int y=climbStairs(n-2);
        // return x+y;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int res=cs(0,n,dp);
        return res;
    }
  //Dynamic Programming using filling dp array using recursion---------------
    // public int cs(int cst,int dst,int[] dp)
    // {
    //     if(cst==dst)
    //     {
    //         return 1;
    //     }
    //     if(cst>dst)
    //     {
    //         return 0;
    //     }
    //     if(dp[cst]!=-1)
    //     {
    //         return dp[cst];
    //     }
    //     int x=cs(cst+1,dst,dp);
    //     int y=cs(cst+2,dst,dp);
    //     dp[cst]=x+y;
    //     return x+y;

    // }
  //Dynamic programming filling array with loops--------
    public int csTab(int cst,int dst,int[] dp)
    {
        dp[dp.length-1]=1;
        for(int i=dp.length-2;i>=0;i--)
        {
            dp[i]=dp[i+1]+(i+2<dp.length?dp[i+2]:0);
        }
        return dp[0];
    }
    
}

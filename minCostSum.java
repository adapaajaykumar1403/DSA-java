//Pure BackTracking code------------------------------------
class Solution {
    public int min=Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        return min(grid,0,0);
        //return min;
        
    }
    public int min(int[][] grid,int cr, int cc)
    {
      //Recursion using Global Variable and void helper------
        // if(cr==grid.length-1 && cc==grid[0].length-1)
        // {
        //     sum=sum+grid[cr][cc];
        //     if(sum<min)
        //     {
        //         min=sum;
        //         return;
        //     }
        // }
        // if(cr>=grid.length || cc>=grid[0].length)
        // {
        //     return;
        // }
        // min(grid,sum+grid[cr][cc],cr+1,cc);
        // min(grid,sum+grid[cr][cc],cr,cc+1);
        if(cr==grid.length-1 && cc==grid[0].length-1)
        {
            return grid[cr][cc];
        }
        if(cr>=grid.length || cc>=grid[0].length)
        {
            return Integer.MAX_VALUE;
        }
        int path1=min(grid,cr,cc+1);
        int path2=min(grid,cr+1,cc);
        return (Math.min(path1,path2))+grid[cr][cc];


    }
}
//method 2--------------------------
class Solution {
    public int min=Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        int ans= minTab(grid,grid.length-1,grid[0].length-1,dp);
        return ans;
       // return min(grid,grid.length-1,grid[0].length-1,dp);
        
    }
    public int minTab(int[][]grid,int cr,int cc,int[][]dp)
    {
        //dp[cr][cc]=grid[cr][cc];
        for(int i=cc;i>=0;i--)
        {
            for(int j=cr;j>=0;j--)
            {
                if(i==cc && j==cr)
                {
                    dp[j][i]=grid[j][i];
                    continue;
                }
                dp[j][i]=Math.min((j+1<=cr?dp[j+1][i]:Integer.MAX_VALUE),(i+1<=cc?dp[j][i+1]:Integer.MAX_VALUE))+grid[j][i];
            }
        }
        return dp[0][0];
    }
    public int min(int[][] grid,int cr, int cc,int[][]dp)
    {
    
        if(cr==grid.length-1 && cc==grid[0].length-1)
        {
            dp[cr][cc]=grid[cr][cc];
            return grid[cr][cc];
        }
        if(cr>=grid.length || cc>=grid[0].length)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[cr][cc]!=-1)
        {
            return dp[cr][cc];
        }
        int path1=min(grid,cr,cc+1,dp);
        int path2=min(grid,cr+1,cc,dp);
        dp[cr][cc]=(Math.min(path1,path2))+grid[cr][cc];
        return (Math.min(path1,path2))+grid[cr][cc];


    }
}

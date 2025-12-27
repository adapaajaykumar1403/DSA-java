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

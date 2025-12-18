class Solution {
    public boolean value=false;
    public boolean checkValidGrid(int[][] grid) {
        helper(0,0,grid,0);
        return value;
           
    }
    public void helper(int r, int c, int [][] grid,int move)
    {
        if(move>=grid.length*grid.length)
        {
            value=true;
            return;
        }
        if(r<0 || c<0 || r>grid.length-1 || c>grid[0].length-1 || grid[r][c]!=move || value==true)
        {
            return;
        }
            helper(r-2,c+1,grid,move+1);
            helper(r-1,c+2,grid,move+1);
            helper(r+1,c+2,grid,move+1);
            helper(r+2,c+1,grid,move+1);
            helper(r-2,c-1,grid,move+1);
            helper(r-1,c-2,grid,move+1);
            helper(r+1,c-2,grid,move+1);
            helper(r+2,c-1,grid,move+1);
       
        // if(move==grid.length*grid.length)
        // {
        //     value= true;
        // }
    }
}

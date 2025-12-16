class Solution {
    public List<List<String>> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int [][]board=new int[n+1][n+1];
        placeQueens(1,n,board);
        return ans;
    }
    public void placeQueens(int row,int n,int[][] board)
    {
        if(row==n+1)
        {
            List<String> combo=new ArrayList<>();
            for(int i=1;i<=n;i++)
            {
                String str="";
                for(int j=1;j<=n;j++)
                {
                    if(board[i][j]==1)
                    {
                        str=str+"Q";
                    }
                    else
                    {
                        str=str+".";
                    }
                }
                combo.add(str);
            }
            ans.add(combo);
            return;
        }
        for(int col=1;col<=n;col++)
        {
            if(isValid(row,col,board))
            {
                board[row][col]=1;
                placeQueens(row+1,n,board);
                board[row][col]=0;
            }
        }
    }
    public boolean isValid(int row,int col,int [][]board)
    {
        for(int i=row;i>=1;i--)
        {
            if(board[i][col]==1)
            {
                return false;
            }
        }
        for(int i=row,j=col;i>=1 && j>=1;i--,j--)
        {
            if(board[i][j]==1)
                return false;
        }
        for(int i=row,j=col;i>=1 && j<=board[0].length-1;i--,j++)
        {
            if(board[i][j]==1)
                return false;
        }
        return true;

    }
}

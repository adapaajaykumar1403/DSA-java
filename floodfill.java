class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        traversal(image,sr,sc,color,new boolean[image.length][image[0].length],image[sr][sc]);
        return image;
    }
    public void traversal(int[][]image,int sr,int sc,int color,boolean[][]vis,int prevcolor)
    {
        if(sr<0|| sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=prevcolor || vis[sr][sc])
        {
            return ;
        }
        int prev=image[sr][sc];
        image[sr][sc]=color;
        vis[sr][sc]=true;
        traversal(image,sr-1,sc,color,vis,prev);
        traversal(image,sr,sc+1,color,vis,prev);
        traversal(image,sr+1,sc,color,vis,prev);
        traversal(image,sr,sc-1,color,vis,prev);
    }
}

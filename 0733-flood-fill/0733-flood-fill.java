class Solution {
    public void func(int[][]image, int sr, int sc, int oldColor, int NewColor){
        int m = image.length;
        int n = image[0].length;
        if(sr<0 || sc<0 || sr>=m || sc>=n || image[sr][sc]!=oldColor) return;
        image[sr][sc] = NewColor;
        func(image,sr+1,sc,oldColor,NewColor);
        func(image,sr-1,sc,oldColor,NewColor);
        func(image,sr,sc+1,oldColor,NewColor);
        func(image,sr,sc-1,oldColor,NewColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        func(image,sr,sc,image[sr][sc],color);
        
        return image;
    }
}
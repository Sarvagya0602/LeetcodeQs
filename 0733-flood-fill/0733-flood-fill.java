class Solution {
    static void fill(int[][] image, int i, int j,int ogclr, int color,int m,int n){
        if(image[i][j]!=ogclr) return;
        image[i][j]=color;

        if(i!=0) fill(image,i-1,j,ogclr,color,m,n);
        if(i!=m-1) fill(image,i+1,j,ogclr,color,m,n);
        if(j!=0) fill(image,i,j-1,ogclr,color,m,n);
        if(j!=n-1) fill(image,i,j+1,ogclr,color,m,n);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length,n=image[0].length;
        int ogclr=image[sr][sc];
        if(ogclr==color) return image;
        fill(image,sr,sc,ogclr,color,m,n);
        return image;
    }
}
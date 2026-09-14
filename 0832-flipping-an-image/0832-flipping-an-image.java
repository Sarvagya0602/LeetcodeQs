class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length,temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                temp=image[i][j];
                image[i][j]=image[i][n-j-1];
                image[i][n-j-1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j]=(image[i][j]+1)%2;
            }
        }
        return image;
    }
}
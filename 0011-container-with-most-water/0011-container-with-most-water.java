class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,maxarea=0;
        while(i<j){
            int area,edge;
            
            if(height[i]<height[j]){
                edge=height[i];
                area=(j-i)*edge;
                i++;
            } else {
                edge=height[j];
                area=(j-i)*edge;
                j--;
            }
            maxarea = (area>maxarea) ? area : maxarea;
        }
        return maxarea;
    }
}
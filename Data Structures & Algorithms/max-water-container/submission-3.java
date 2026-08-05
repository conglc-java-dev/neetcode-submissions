class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0 ;
        int j=heights.length -1;
        int i=0;
        while(i<j){
            int h = Math.min(heights[i],heights[j]);
            int w =j-i;
            maxArea = Math.max(maxArea,h*w);
            if(heights[i]<heights[j]) i++;
            else j--;
        }
        return maxArea;
    }
}

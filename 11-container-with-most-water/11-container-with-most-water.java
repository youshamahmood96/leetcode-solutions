class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int h = Math.min(height[i],height[j]);
            int l = j-i;
            int currArea = l*h;
            area = Math.max(area,currArea);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return area;
    }
}
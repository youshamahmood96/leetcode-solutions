class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int [height.length];
        int[] minLR = new int [height.length];
        int res = 0;
        maxLeft[0] = 0;
        maxRight[height.length-1] = 0;
        int currL = 0;
        int currR = 0;
        for(int i=1;i<maxLeft.length;i++){
            currL = Math.max(currL,height[i-1]);
            maxLeft[i] = currL;
        }
        for(int i=maxRight.length-2;i>=0;i--){
            currR = Math.max(currR,height[i+1]);
            maxRight[i] = currR;
        }
        for(int i=0;i<maxLeft.length;i++){
            minLR[i] = Math.min(maxLeft[i],maxRight[i]);
        }
        for(int i=0;i<minLR.length;i++){
            if(minLR[i]-height[i]>0){
                res+=minLR[i]-height[i];
            }
        }
        return res;
    }
}
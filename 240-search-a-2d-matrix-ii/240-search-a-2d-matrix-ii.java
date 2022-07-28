class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int k=0;k<matrix.length;k++){
            int[] curr = matrix[k];
            int i = 0;
            int j = curr.length-1;
            while(i<=j){
                int mid = (i+j)/2;
                if(curr[mid]<target) i = mid+1;
                else if(curr[mid]>target) j = mid-1;
                else return true;
            }
        }
        return false;
    }
}
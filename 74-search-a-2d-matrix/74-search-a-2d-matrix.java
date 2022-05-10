class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] t = new int[matrix[0].length];
        int n = matrix[0].length - 1;
        int left = 0;
        int right = matrix.length - 1;
        int pt = -1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(matrix[mid][0]<target && matrix[mid][n]<target) left = mid + 1;
            else if(matrix[mid][0]>target && matrix[mid][n]>target) right = mid - 1;
            else{
                pt = mid;
                break;
            }
        }
        if(pt == -1) return false;
        int l = 0;
        int r = n;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(matrix[pt][mid]<target) l = mid + 1;
            else if(matrix[pt][mid]>target) r = mid - 1;
            else return true;
        }
        return false;
    }
}
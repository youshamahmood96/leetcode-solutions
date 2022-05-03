class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<String> set = new HashSet<String>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
               if(!set.add(matrix[i][j]+"row"+i) || !set.add(matrix[i][j]+"col"+j)){
                   return false;
               }
            }
        }
        return true;
    }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<String>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(set.contains("row"+i+board[i][j]) || set.contains("column"+j+board[i][j])){
                        return false;
                    }
                    set.add("row"+i+board[i][j]);
                    set.add("column"+j+board[i][j]);
                    if(set.contains("box"+(i/3)+(j/3)+board[i][j])){
                        return false;
                    }
                    set.add("box"+(i/3)+(j/3)+board[i][j]);
                }
            }
        }
        return true;
    }
}
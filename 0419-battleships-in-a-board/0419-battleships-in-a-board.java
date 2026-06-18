class Solution {
    private void dfs(char[][]board, int n, int m, int i, int j){
        if(i<0 || j<0 || i>=n || j>=m || board[i][j]=='.')  
            return;
        board[i][j]= '.';
        dfs(board,n,m,i+1,j);
        dfs(board,n,m,i-1,j);
        dfs(board,n,m,i,j+1);
        dfs(board,n,m,i,j-1);
    }
    public int countBattleships(char[][] board) {
        int count=0;
        int n= board.length;
        int m= board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='X'){
                    dfs(board,n,m,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
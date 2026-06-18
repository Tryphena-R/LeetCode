class Solution {
    private void dfs(char[][]grid, int n, int m, int i, int j){
        if(i<0 || j<0 || i>=n || j>=m)
            return;
        if(grid[i][j]=='0')
            return;
        grid[i][j]='0';
        dfs(grid,n,m,i+1,j);
        dfs(grid,n,m,i-1,j);
        dfs(grid,n,m,i,j+1);
        dfs(grid,n,m,i,j-1);
    } 
    public int numIslands(char[][] grid) {
        int count=0;
        int n= grid.length;
        int m= grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,n,m,i,j);
                }
            }
        }
        return count;
    }
}
class Solution {
    int area=0;
    private int dfs(int[][]grid, int n, int m, int i, int j){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0)
            return 0;
        area++;
        grid[i][j]= 0;
        dfs(grid,n,m,i+1,j);
        dfs(grid,n,m,i-1,j);
        dfs(grid,n,m,i,j+1);
        dfs(grid,n,m,i,j-1);
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea=0;
        int count=0;
        int n= grid.length;
        int m= grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    area= 0;      
                    dfs(grid,n,m,i,j);
                    maxarea= Math.max(maxarea, area);
                }
            }
        }
        return maxarea;
    }
}
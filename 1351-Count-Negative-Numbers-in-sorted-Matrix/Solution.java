class Solution {
    public int countNegatives(int[][] grid) {
        
        int row = grid.length - 1;
        int col = 0;
        
        int n = grid[0].length;

        int count = 0;

        while(row >= 0 && col < n){
            if(grid[row][col] < 0){
                count += n - col;
                row--;
            }
            else{
                col++;
            }
        }
        return count;
    }
}
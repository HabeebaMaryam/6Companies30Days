class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;

        int[][] ans = new int[n][m];
        int[] x = {0,0,1,-1,-1,1,-1,1};
        int[] y = {1,-1,0,0,1,1,-1,-1};
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int sum = img[i][j];
                int cells = 1;
                for(int k = 0; k < x.length; k++){
                    int x_val = x[k] + i;
                    int y_val = y[k] + j;
                    if(x_val < 0  || y_val < 0 || x_val >= n || y_val>=m)continue;
                    sum += img[x_val][y_val];
                    cells++;
                }
                ans[i][j] = (int)Math.floor(sum / cells);
            }
        }
        return ans;
    }
}
